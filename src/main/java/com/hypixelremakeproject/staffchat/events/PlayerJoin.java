package com.hypixelremakeproject.staffchat.events;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

import com.hypixelremakeproject.staffchat.StaffChat;

public class PlayerJoin implements Listener {
	
	private StaffChat plugin;
	
	public PlayerJoin(StaffChat plugin) {
		this.plugin = plugin;
	}
	
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (!(player.hasPermission("staffchat.sc"))) {
			player.sendMessage(ChatColor.RED + "You need " + ChatColor.BLUE +"JR HELPER " +ChatColor.RED + "to do this.");
		}
	}
}
