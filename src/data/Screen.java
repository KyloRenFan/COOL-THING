package data;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen{

public Screen(){
JFrame f = new JFrame();
f.setSize(500, 700);
f.setVisible(true);
f.setDefaultCloseOperation(3);
JButton b = new JButton("START MULTIPLAYER GAME");
b.setSize(15, 40);
JButton b2 = new JButton("START SINGLEPLAYER GAME");
b2.setSize(15, 40);
JButton b3 = new JButton("INSTRUCTIONS");
b3.setSize(15, 40);

f.add(b3);
f.add(b2);
f.add(b);

  }

//public static void main(String[] args) {
	//new Screen();
//}

}


