package ca.noxgamingqc.minecraft_plugin.listeners;

import ca.noxgamingqc.minecraft_plugin.Main;
import ca.noxgamingqc.minecraft_plugin.utilities.Utilities;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(player.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utilities.text(plugin, plugin.getConfig().getString("join_message").replace("<player>", player.getName())));			
		} else {
			Bukkit.broadcastMessage(Utilities.text(plugin, plugin.getConfig().getString("first_join_message").replace("<player>", player.getName())));	
		}
	}
}
