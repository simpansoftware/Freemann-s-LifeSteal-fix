package fr.freemann;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import fr.freemann.commands.LifeStealHelpCommand;
import fr.freemann.commands.game.WithdrawCommand;
import fr.freemann.commands.game.giveCommand;
import fr.freemann.listeners.PluginListeners;
import fr.freemann.recipes.EnchantedDiamond;
import fr.freemann.recipes.Heart;

public class Main extends JavaPlugin implements Listener {

    
    @Override
    public void onEnable() {
        
        Bukkit.broadcastMessage("§6[Freemann Life Steal]§a Starting Plugin ...");
        
        
        
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new PluginListeners(), this);
        
        
        
        getCommand("giveheart").setExecutor(new giveCommand());
        getCommand("lshelp").setExecutor(new LifeStealHelpCommand());
        getCommand("withdraw").setExecutor(new WithdrawCommand());
        
        
        //Recipees
        EnchantedDiamond.InitEnchantedDiamondBlockRecipe();
        Heart.InitHeartRecipe();
        
        
        Bukkit.broadcastMessage("§6[Freemann Life Steal]§a Plugin started with §bsucess");
    }
    
    @Override
    public void onDisable() {
        
    }
    
}

