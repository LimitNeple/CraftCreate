package net.xpoint.craftcreate.graphics;

import net.xpoint.craftcreate.etc.Tile;
import net.xpoint.craftcreate.init.ItemInit;

public class TileGeneration {
	
	public static final int WIDTH = 40;
	public static final int HEIGHT = 30;
	
	private Tile[][] world = new Tile[WIDTH][HEIGHT];
	
	public TileGeneration() {
		
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < 10; y++) {
				world[x][y] = new Tile(ItemInit.dirt);
			}
		}
		
	}
	
}
