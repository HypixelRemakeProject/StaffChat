package com.hypixelremakeproject.staffchat;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class StaffChat extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[STAFFCHAT] " + ChatColor.GREEN + "Plugin is successfully enabled!");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[STAFFCHAT] " + ChatColor.RED + "Plugin is successfully disabled...");
	}
	
}
