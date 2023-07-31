package ca.noxgamingqc.minecraft_plugin.utilities;

import ca.noxgamingqc.minecraft_plugin.Main;
import org.bukkit.ChatColor;


public class Utilities {
	public static String text (Main plugin, String string) {
		return ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("prefix") + string);
	}
}
