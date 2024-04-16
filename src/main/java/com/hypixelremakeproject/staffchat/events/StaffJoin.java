package com.hypixelremakeproject.staffchat.events;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

import com.hypixelremakeproject.staffchat.StaffChat;

public class StaffJoin implements Listener {
	
	private StaffChat plugin;
	
	public StaffJoin(StaffChat plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (!(player.hasPermission("staffchat.sc"))) {
			player.sendMessage(ChatColor.RED + "You need " + ChatColor.BLUE +"JR HELPER " +ChatColor.RED + "to do this.");
		} else {
			Bukkit.broadcast(ChatColor.AQUA + "[STAFF] " + player.getName() + ChatColor.YELLOW + "joined!", "staffchat.sc");
		}
	}
}