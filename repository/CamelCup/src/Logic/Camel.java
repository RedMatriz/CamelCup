package Logic;

import java.awt.Color;

public class Camel 
{
	private boolean hasRolled;
	private Dice d;
	private Color color;
	private int pos;
	public Camel(Color c)
	{
		hasRolled=false;
		color=c;
	}
	public void setPos(int x)
	{
		pos=x;
	}
	public int getRoll()
	{
		int x = 0;
		hasRolled=true;
		//x=d.roll;
		return x;
	}
	public void resetRoll()
	{
		hasRolled=false;
	}
	public int getPos()
	{
		return pos;
	}

}
