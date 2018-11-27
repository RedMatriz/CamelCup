package Graphics;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphicsPanel extends JPanel
{
	BufferedImage background, action;
	int count;
	public GraphicsPanel()
	{
		try {
			background = readImage("Board.png");
		} catch (IOException e) {
			System.out.println("You bad lol");
		}
		action = new BufferedImage(background.getWidth(),background.getHeight(),BufferedImage.TYPE_INT_ARGB);
		count = 0;
		this.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e)
			{
				try {
					background = readImage("frame" + count + ".png");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				count++;
				updateAction();
			}
		});
		updateAction();
		repaint();
	}
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawImage(resize(action, this.getWidth(), this.getHeight()), 0, 0, null);
	}
	public static BufferedImage resize(BufferedImage img, int newW, int newH) { 
	    Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();
	    return dimg;
	}
	public void updateAction()
	{
		Font f = new Font("Comic Sans MS", 0,10);
		Graphics2D g2d = action.createGraphics();
		g2d.drawImage(background, 0, 0, null);
		/*g2d.setColor(Color.RED);
		g2d.setFont(f);
		g2d.drawString(count + "", action.getWidth()/2, action.getHeight()/2);*/
		repaint();
	}
	private BufferedImage readImage(String name) throws IOException
	{
		return ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\assets\\" + name));
	}
}
