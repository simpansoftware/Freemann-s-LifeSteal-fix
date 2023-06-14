package fr.freemann.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItems {
    
    public static ItemStack getHearthItem() {
        ItemStack hearthItem = new ItemStack(Material.NETHER_STAR);
        ItemMeta hearthM = hearthItem.getItemMeta();
        hearthM.setDisplayName("§cHeart");
        hearthItem.setItemMeta(hearthM);
        return hearthItem;
    }
    public static ItemStack getEnchantedDiamondBlockItem(){
        ItemStack EnchantedDiamondBlock = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta diamondM = EnchantedDiamondBlock.getItemMeta();
        diamondM.addEnchant(Enchantment.OXYGEN, 1, true);
        diamondM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        diamondM.setDisplayName("§bEnchanted diamond block");
        EnchantedDiamondBlock.setItemMeta(diamondM);
        return EnchantedDiamondBlock;
    }
    
}
