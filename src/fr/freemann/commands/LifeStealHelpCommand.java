package fr.freemann.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LifeStealHelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
        sender.sendMessage("§aList of the commands :");
        sender.sendMessage("§a");
        return false;
    }

}
