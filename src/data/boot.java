package data;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import helpers.Artist;

import static org.lwjgl.opengl.GL11.*;
import static helpers.Artist.*;

public class boot {
	public static final String TITLE = "Alpha";
	public static final int WIGHT = 1280;
	public static final int HIEGHT = 840;

	public boot() {

		Artist.test();
		/*
		 * Display.setTitle(TITLE); try { Display.setDisplayMode(new
		 * DisplayMode(WIGHT, HIEGHT)); Display.create(); } catch
		 * (LWJGLException e) { e.printStackTrace(); }
		 * 
		 * glMatrixMode(GL_PROJECTION); //glMatrixMode(GL_3D); glLoadIdentity();
		 * glOrtho(0, 600, 400, 0, 1, -1); glMatrixMode(GL_MODELVIEW);
		 

		Tile tile = new Tile(0, 0, 64, 64, TileType.Grass);
		Tile tile2 = new Tile(0, 64, 64, 64, TileType.Grass);
		Tile tile3 = new Tile(64, 64, 64, 64, TileType.Grass);

		tile.Draw();
		tile2.Draw();
		tile3.Draw();
		*/
		
		TileGrid t = new TileGrid();
		t.mTileGrid();
		Display.update();
		Display.sync(60);

		while (Display.isCloseRequested()) {
			System.exit(0);
		}
		while (!Display.isCloseRequested()) {

			boolean run = false;
			if (!run) {
				// Display.update();
				// Display.sync(0);
				run = false;
			}

		}
		while (Display.isCloseRequested()) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new boot();
	}

}
