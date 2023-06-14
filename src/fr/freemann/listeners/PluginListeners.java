package fr.freemann.listeners;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import fr.freemann.utils.CustomItems;

public class PluginListeners implements Listener {

    @EventHandler
    public void playerInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack it = e.getItem();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(it != null && it.getType() == Material.NETHER_STAR) {
                if(it.getItemMeta().getDisplayName() == CustomItems.getHearthItem().getItemMeta().getDisplayName()) {
                    player.setMaxHealth(player.getMaxHealth() + 2);
                    if(player.getItemInHand().getAmount() <= 1) {
                        player.getInventory().remove(CustomItems.getHearthItem());
                    }else {
                    player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
                    }
                    player.updateInventory();
                    player.sendMessage("§6[Freemann Life Steal]§a You gaind one §cheart");
                }
            }
        }
    }
    @EventHandler
    public void removePlayerHearthOnDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        if(player.getMaxHealth() <= 2) {
            player.setGameMode(GameMode.SPECTATOR);
            World world = player.getWorld();
            
            for(Player players : Bukkit.getOnlinePlayers()) {
            world.playSound(players.getLocation(), Sound.WITHER_SPAWN, 1.0F, 1.0F);
            }

        }else{
            player.setMaxHealth(player.getMaxHealth() - 2);
        }
        World world = player.getWorld();
        world.strikeLightningEffect(player.getLocation());
        if(e.getEntity().getKiller() instanceof Player) {
            Player killer = e.getEntity().getKiller();
            killer.setMaxHealth(killer.getMaxHealth() + 2);
        }
    }
}
