package Logic;

public class Dice {
	private int val;
	public Dice() {
		val =(int)(Math.random()*3+1);
	}
	public void roll() {
		val =(int)(Math.random()*3+1);
	}
	public int getVal() {
	return val;
	}
}
