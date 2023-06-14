package fr.freemann.commands.game;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.freemann.utils.CustomItems;

public class giveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
        if(sender.isOp()) {
            if(sender instanceof Player) {
                Player player = ((Player) sender).getPlayer();
                player.getInventory().addItem(CustomItems.getHearthItem());
            }
        }else {
            sender.sendMessage("§6[Freemann Life Steal]§a You are not §bop §aon this server");
        }
        return false;
    }

}
