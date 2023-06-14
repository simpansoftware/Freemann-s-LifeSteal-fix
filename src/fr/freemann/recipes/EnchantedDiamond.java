package fr.freemann.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import fr.freemann.utils.CustomItems;

public class EnchantedDiamond {

    public static void InitEnchantedDiamondBlockRecipe() {
        ItemStack EncantedDiamondB = CustomItems.getEnchantedDiamondBlockItem();
        ShapedRecipe EnchantedDiamondBRecipe = new ShapedRecipe(EncantedDiamondB);
        EnchantedDiamondBRecipe.shape("DDD","DBD","DDD");
        EnchantedDiamondBRecipe.setIngredient('D', Material.DIAMOND);
        EnchantedDiamondBRecipe.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(EnchantedDiamondBRecipe);
    }
    
}
