package unhappy.simrpg.plugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import unhappy.simrpg.plugin.Main;
import unhappy.simrpg.plugin.utils.Utils;

public class JoinListener implements Listener {
    private static Main plugin;
    public  JoinListener(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        String joinMessage = Utils.chat("&a&lJOIN &7[&a+&7] " + " &7" + p.getName());
        if (!p.hasPlayedBefore()) {
            joinMessage = Utils.chat("&a&lWELCOME&r &7[&a+&7] " + " &7" + p.getName());
        }
        event.setJoinMessage(joinMessage);
    }
}
