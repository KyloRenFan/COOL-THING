package data;

public enum TileType {

	Grass("Grass", true), Dirt("Dirt", false);

	String texname;
	boolean buildable;

	TileType(String texname, boolean buildable) {
		this.texname = texname;
		this.buildable = buildable;
	}

}
