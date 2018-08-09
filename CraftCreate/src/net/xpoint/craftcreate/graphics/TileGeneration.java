package net.xpoint.craftcreate.graphics;

import net.xpoint.craftcreate.init.ItemInit;
import net.xpoint.craftcreate.tile.Tile;
import net.xpoint.craftcreate.tile.TileInit;

public class TileGeneration {
	
	public static final int WIDTH = 40;
	public static final int HEIGHT = 30;
	
	private Tile[][] world = new Tile[HEIGHT][WIDTH];
	
	public TileGeneration() {
		
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < 19; y++) {
				world[y][x] = TileInit.air;
			}
			world[19][x] = TileInit.grass;
			for(int y = 20; y < HEIGHT; y++) {
				world[y][x] = TileInit.dirt;
			}
		}
		
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				System.out.print(world[y][x].getItem().getAdressName().charAt(0));
			}
			System.out.println();
		}
		
	}
	
	public Tile[][] getWorld(){
		return world;
	}
	
}
