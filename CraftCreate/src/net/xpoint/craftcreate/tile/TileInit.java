package net.xpoint.craftcreate.tile;

import net.xpoint.craftcreate.init.ItemInit;

public class TileInit {

	public static Tile air = new Tile(ItemInit.air, Integer.MAX_VALUE);
	public static Tile dirt = new Tile(ItemInit.dirt, 4);
	public static Tile stone = new Tile(ItemInit.stone, 8);
	public static Tile lava = new Tile(ItemInit.lava, 4);
	public static Tile grass = new Tile(ItemInit.grass, 3);
	
	
}
