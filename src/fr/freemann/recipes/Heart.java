package fr.freemann.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import fr.freemann.utils.CustomItems;

public class Heart {

    public static void InitHeartRecipe() {
        ItemStack heart = CustomItems.getHearthItem();
        ShapedRecipe heartRecipe = new ShapedRecipe(heart);
        heartRecipe.shape("DDD","GNG","DDD");
        heartRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
        heartRecipe.setIngredient('G', Material.GOLD_BLOCK);
        heartRecipe.setIngredient('N', Material.NETHER_STAR);
        Bukkit.addRecipe(heartRecipe);
    }
    
}
