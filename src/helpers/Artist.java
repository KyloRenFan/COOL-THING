package helpers;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import java.io.IOException;
import java.io.InputStream;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import data.boot;

public class Artist extends boot {

	public static void test() {

		Display.setTitle(TITLE);
		try {
			Display.setDisplayMode(new DisplayMode(WIGHT, HIEGHT));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}

		glMatrixMode(GL_PROJECTION);
		// glMatrixMode(GL_3D);
		glLoadIdentity();
		glOrtho(0, WIGHT, HIEGHT, 0, 1, -1);
		glEnable(GL_TEXTURE_2D);
	}

	public static void DQT(Texture tex, float x, float y, float wight, float hight) {
		tex.bind();
		glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(wight, 0);
		glTexCoord2f(1, 1);
		glVertex2f(wight, hight);
		glTexCoord2f(0, 1);
		glVertex2f(0, hight);
		glEnd();
		//glLoadIdentity();

	}

	public static Texture LoadTexture(String path, String file) {
		Texture tex = null;
		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(file, in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tex;
	}

	public static Texture QuickLoad(String name) {
		Texture tex = null;
		tex = LoadTexture("res/" + name + ".png", "PNG");
		return tex;
	}
	

}
