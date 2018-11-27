package Logic;

public class Track {
	private Tile[] tiles;

	public void move(Camel c, int amt) {
		c.setPos(c.getPos() + amt);
	}

	public void setCamel(Camel c, int loc) {
		c.setPos(loc);
	}

	public Boolean checkSideDesert(int loc) {
		if (tiles[loc - 1].hasDesertTile())
			return false;
		else if (tiles[loc + 1].hasDesertTile())
			return false;
		else
			return true;
	}

	public int getPos(Camel c) {
		return c.getPos();
	}
}
