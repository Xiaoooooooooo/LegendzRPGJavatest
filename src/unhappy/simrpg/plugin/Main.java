package unhappy.simrpg.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import unhappy.simrpg.plugin.commands.Fly;
import unhappy.simrpg.plugin.commands.GUI;
import unhappy.simrpg.plugin.commands.Hello;
import unhappy.simrpg.plugin.listeners.InventoryClickListener;
import unhappy.simrpg.plugin.listeners.JoinListener;
import unhappy.simrpg.plugin.listeners.PlayerDeathListener;
import unhappy.simrpg.plugin.ui.TestUI;

import java.io.IOException;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        new JoinListener(this);
        new Hello(this);
        new GUI(this);
        new Fly(this);
        new PlayerDeathListener(this);
        new InventoryClickListener(this);
        TestUI.initialize();
    }

    public void onDisable() {

    }
}
