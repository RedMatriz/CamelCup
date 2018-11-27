package Logic;

import java.util.ArrayList;

public class Tile {
	private ArrayList<Camel> camelList;
	private int pos;
	private DesertTile tile;

	public void addCamel(Camel c) {
		camelList.add(c);
	}

	public ArrayList<Camel> removeCamel(Camel c) {
		ArrayList<Camel> temp = new ArrayList<Camel>();
		for(int i = camelList.size()-1; i >= 0; i--)
		{
			if(camelList.get(i).equals(c))
			{
				temp.add(camelList.remove(i));
				return temp;
			}else
				temp.add(camelList.remove(i));
		}
		return null;
	}

	public int getPos() {
		return pos;
	}

	public void addDesertTile(DesertTile t) {
		tile = t;
	}

	public DesertTile removeDesertTile() {
		DesertTile temp = tile;
		tile = null;
		return temp;
	}

	public boolean hasDesertTile() {
		return !tile.equals(null);
	}
}
