package unhappy.simrpg.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import unhappy.simrpg.plugin.Main;

public class Hello implements CommandExecutor {
    @SuppressWarnings("unused")
    private Main plugin;

    public Hello(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("hello").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if (p.hasPermission("is.member")) {
            p.sendMessage("Hi");
            return true;
        } else {
            p.sendMessage("You don't have permission");
        }
        return false;
    }
}
