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

public class StaffJoin implements Listener {
	
	private StaffChat plugin;
	private LuckPerms luckPerms;
	
	public StaffJoin(StaffChat plugin, LuckPerms luckPerms) {
		this.plugin = plugin;
		this.luckPerms = luckPerms;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
		for (Node node : user.getNodes()) {
			if (node instanceof PrefixNode) {
				PrefixNode prefixNode = (PrefixNode) node;
				String prefix = prefixNode.getMetaValue();
				break;
			}
			if (!(player.hasPermission("staffchat.sc"))) {
				player.sendMessage(ChatColor.RED + "You need " + ChatColor.BLUE +"JR HELPER " +ChatColor.RED + "to do this.");
			} else {
				Bukkit.broadcast(ChatColor.AQUA + "[STAFF] " + player.getName() + ChatColor.YELLOW + "joined!", "staffchat.sc");
			}
		}
	}
}
