package net.xpoint.craftcreate.etc;

import net.xpoint.craftcreate.item.Item;

public class Tile {
	
	private Item item;
	private int damage;
	private int maxDamage;
	
	public Tile(Item item, int maxDamage) {
		this.item = item;
		this.maxDamage = maxDamage;
		damage = 0;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getMaxDamage() {
		return maxDamage;
	}
	
	public Item getItem() {
		return item;
	}
	
}
