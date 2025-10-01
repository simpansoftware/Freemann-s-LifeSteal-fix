package fr.freemann.commands.game;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.freemann.utils.CustomItems;

public class WithdrawCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.getMaxHealth() > 2) {
                player.setMaxHealth(player.getMaxHealth() - 2);
                player.getInventory().addItem(CustomItems.getHearthItem());
                player.sendMessage("§6[Freemann Life Steal]§c Heart§b withdrawn §a with success !");
                player.updateInventory();
            }
        }else {
            sender.sendMessage("§6[Freemann Life Steal]§c You are not a player");
        }
        return false;
    }

}
