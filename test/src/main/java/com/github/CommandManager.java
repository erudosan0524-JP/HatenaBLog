package com.github;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandManager implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			return true;
		}

		Player player = (Player) sender;

		if(args.length != 0) {
			if(args[0].equalsIgnoreCase("a")) {
				if(player.hasPermission("test.example.a")) {
					//権限を持っている場合
					player.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
					return true;
				} else {
					//権限を持っていない場合
					player.sendMessage("君にはこのコマンドは使えない！！！");
					return true;
				}
			}
		}


		player.getInventory().addItem(new ItemStack(Material.DIAMOND,64));
		return false;
	}
}
