package net.xpoint.craftcreate.graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class CCFrame extends JFrame{

	public CCFrame() {
		setTitle("Craft Create! [Dev Version]");
		setSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		setVisible(true);
	}
	
}
