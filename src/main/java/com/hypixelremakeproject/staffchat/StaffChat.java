package com.hypixelremakeproject.staffchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.luckperms.api.LuckPerms;

import com.hypixelremakeproject.staffchat.events.StaffJoin;
import com.hypixelremakeproject.staffchat.events.StaffLeave;

public class StaffChat extends JavaPlugin {
	
	private LuckPerms luckPerms;
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[STAFFCHAT] " + ChatColor.GREEN + "Plugin is successfully enabled!");

		getServer().getPluginManager().registerEvents(new StaffJoin(), this);
		if (!setupLuckPerms()) {
            getLogger().severe("Unable to hook into LuckPerms. Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }

    private boolean setupLuckPerms() {
        RegisteredServiceProvider<LuckPerms> provider = getServer().getServicesManager().getRegistration(LuckPerms.class);
        if (provider != null) {
            luckPerms = provider.getProvider();
            return true;
        }
        return false;
    }

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[STAFFCHAT] " + ChatColor.RED + "Plugin is successfully disabled...");
	}

}
