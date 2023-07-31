package ca.noxgamingqc.minecraft_plugin.listeners;

import ca.noxgamingqc.minecraft_plugin.Main;
import ca.noxgamingqc.minecraft_plugin.utilities.Utilities;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public LeaveListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		Bukkit.broadcastMessage(Utilities.text(plugin, plugin.getConfig().getString("leave_message").replace("<player>", player.getName())));			
	}
}
