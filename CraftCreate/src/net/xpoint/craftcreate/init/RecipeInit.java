package net.xpoint.craftcreate.init;

import java.util.HashSet;

import net.xpoint.craftcreate.recipe.Recipe;

public class RecipeInit {
	
	public static HashSet<Recipe> recipeList = new HashSet<Recipe>();
	
	private static RecipeInit inst;
	
	public static RecipeInit getInstance() {
		if(inst == null) {
			inst = new RecipeInit();
		}
		
		return inst;
	}
	
	private RecipeInit() {
		
		//Recipe List
		
		recipeList.add(new Recipe(ItemInit.dirt, ItemInit.lava, ItemInit.grass));
		
	}
	
}
