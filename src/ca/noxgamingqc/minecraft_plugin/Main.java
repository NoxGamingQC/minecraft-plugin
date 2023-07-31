package ca.noxgamingqc.minecraft_plugin;

import org.bukkit.plugin.java.JavaPlugin;
import ca.noxgamingqc.minecraft_plugin.commands.HelloCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
	
	@Override
	public void onDisable() {
	}
}
