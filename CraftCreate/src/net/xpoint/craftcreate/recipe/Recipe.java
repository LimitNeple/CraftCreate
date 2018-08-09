package net.xpoint.craftcreate.recipe;

import net.xpoint.craftcreate.item.Item;

public class Recipe {
	
	private Item ip1, ip2, op;
	
	public Recipe(Item ip1, Item ip2, Item op) {
		this.ip1 = ip1;
		this.ip2 = ip2;
		this.op = op;
	}
	
	@Override
	public boolean equals(Object anotherRecipe) {
		Recipe anRecipe = (Recipe)anotherRecipe;
		return (ip1.equals(anRecipe.getFirstInput()) || ip1.equals(anRecipe.getSecondInput()) && (ip2.equals(anRecipe.getFirstInput())) || ip2.equals(anRecipe.getSecondInput()));
	}
	
	public Item getFirstInput() {
		return ip1;
	}
	
	public Item getSecondInput() {
		return ip2;
	}
	
	public Item getOutput() {
		return op;
	}
	
}
