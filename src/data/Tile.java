package data;

import org.newdawn.slick.opengl.Texture;

import helpers.Artist;

public class Tile {
	private float x, y, wight, hight;
	private Texture tex;
	private TileType type;

	public Tile(float x, float y, float wight, float hight, TileType type) {
		this.x = x;
		this.y = y;
		this.wight = wight;
		this.hight = hight;
		this.type = type;
		this.tex = Artist.QuickLoad(type.texname);
	}

	public void Draw() {
		Artist.DQT(tex, x, y, wight, hight);

	}

	public void DRAW() {
		VERT v = new VERT();
		v.cVERT(tex, x, y, wight, hight);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWight() {
		return wight;
	}

	public void setWight(float wight) {
		this.wight = wight;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	public Texture getTex() {
		return tex;
	}

	public void setTex(Texture tex) {
		this.tex = tex;
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}

}
