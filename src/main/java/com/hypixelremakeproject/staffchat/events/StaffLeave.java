package com.hypixelremakeproject.staffchat.events;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import net.luckperms.api.node.types.PrefixNode;

import com.hypixelremakeproject.staffchat.StaffChat;

public class StaffLeave implements Listener {
	
	private StaffChat plugin;
	private LuckPerms luckPerms;
	
	public StaffLeave(StaffChat plugin, LuckPerms luckPerms) {
		this.plugin = plugin;
		this.luckPerms = luckPerms;
	}
}
