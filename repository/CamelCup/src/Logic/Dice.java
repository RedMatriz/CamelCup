package Logic;

public class Dice {
	private int val;
	
	public Dice() {
		val =(int)Math.random()*3+1; //idk if i should make the value prerolled? or 1? Or 0?
	}
	public void roll() {
		val =(int)Math.random()*3+1;
	}
	public int getVal() {
	return val;	
	}
}
