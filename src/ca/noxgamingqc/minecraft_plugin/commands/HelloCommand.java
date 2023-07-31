package ca.noxgamingqc.minecraft_plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ca.noxgamingqc.minecraft_plugin.Main;

public class HelloCommand implements CommandExecutor {

	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			if(command.getName().equalsIgnoreCase("hello")) {
				Player player = (Player) sender;
				if(player.hasPermission("noxgamingqc.hello.use")) {
					player.sendMessage("Hi!");
					return true;
				} else {
					player.sendMessage("You don't have permission to execute this command!");
					return false;
				}
			}
		}
		sender.sendMessage("Only Players may execute this command!");
		return false;
	}
}
