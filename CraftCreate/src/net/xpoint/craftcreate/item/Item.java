package net.xpoint.craftcreate.item;

public class Item implements IItem{

	private String name, adname;
	private int level;
	
	public Item(String name, String adname, int level) {
		this.name = name;
		this.adname = adname;
		this.level = level;
	}
	
	@Override
	public String getItemName() {
		return name;
	}

	@Override
	public int getItemLevel() {
		return level;
	}
	
	@Override
	public String getAdressName() {
		return adname;
	}
	
	@Override
	public String toString() {
		return name + "(Lv : " + level + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Item)obj).getItemName());
	}
	
}
