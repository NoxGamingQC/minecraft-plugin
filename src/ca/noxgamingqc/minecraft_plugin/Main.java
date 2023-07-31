package ca.noxgamingqc.minecraft_plugin;

import ca.noxgamingqc.minecraft_plugin.commands.HelloCommand;
import ca.noxgamingqc.minecraft_plugin.listeners.JoinListener;
import ca.noxgamingqc.minecraft_plugin.listeners.LeaveListener;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		new HelloCommand(this);
		new JoinListener(this);
		new LeaveListener(this);
	}
	
	@Override
	public void onDisable() {
	}
}
