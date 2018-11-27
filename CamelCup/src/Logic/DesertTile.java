package Logic;

public class DesertTile {
	private int side;
	private int pos;
	private String name;
	
	public DesertTile(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}

	public int getSide()
	{
		return side;
	}
	
	public int getPos()
	{
		return pos;
	}
	
	public void setSide(int s)
	{
		side = s;
	}

}
