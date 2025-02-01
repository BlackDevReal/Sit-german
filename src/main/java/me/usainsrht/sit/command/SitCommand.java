package me.usainsrht.sit.command;

import me.usainsrht.sit.Sit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class SitCommand extends Command {

    public SitCommand(String name, String description, String usageMessage, List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String command, String[] args) {
        if (sender.hasPermission("sitzen.command"))
        {
            if (args.length == 0) {
                sender.sendMessage("/sitzen neuladen");
            }
            else if (args[0].equalsIgnoreCase("neuladen")) {
                Sit.getInstance().reloadConfig();

                sender.sendMessage(ChatColor.GREEN+"die configuration wurde erfolreich neugeladen.");
            }
            else {
                sender.sendMessage("/sitzen neuladen");
            }
        }
        return true;
    }

}
