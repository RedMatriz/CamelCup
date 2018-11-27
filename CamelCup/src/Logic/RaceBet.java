package Logic;

public class RaceBet {
	private static final int[] rewardVals = {8,5,3,2,1,-1};
	private Player owner;
	private Camel bet;
	public RaceBet(Camel c, Player p) {
		bet = c;
		owner = p;
	}
	public Player getPlayer() {
		return owner;
	}

	public Camel getCamel() {
		return bet;
	}
}
