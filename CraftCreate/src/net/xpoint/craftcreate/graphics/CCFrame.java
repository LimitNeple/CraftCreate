package net.xpoint.craftcreate.graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import net.xpoint.craftcreate.tile.Tile;

public class CCFrame extends JFrame{

	private TileGeneration tg;
	private Tile[][] world;
	
	public CCFrame() {
		setTitle("Craft Create! [Dev Version]");
		setSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		tg = new TileGeneration();
		world = tg.getWorld();
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(new ImageIcon("res/background/back1.png").getImage(), 0, 0, null);
		for(int i = 0; i < TileGeneration.HEIGHT; i++) {
			for(int j = 0; j < TileGeneration.WIDTH; j++) {
				ImageIcon ii = new ImageIcon("res/tile/" + world[i][j].getItem().getAdressName() + ".png");
				Image im = ii.getImage();
				g.drawImage(im, j*20, i*20, null);
				System.out.println("Draw : " + world[i][j].getItem());
			}
		}
	}
	
}
