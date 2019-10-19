package com.github;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandManager implements CommandExecutor{
//
//	JavaPlugin plg;
//
//	public CommandManager(JavaPlugin plg) {
//		this.plg = plg;
//	}


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

//			if(args[0].equalsIgnoreCase("start")) {
//				//example start <何か>
//				if(args[1].length() != 0) {
//					int i;
//					try {
//						i = Integer.parseInt(args[1]);
//					}catch(NumberFormatException e) {
//						i = 10;
//					}
//					Timer timer = new Timer(plg,i);
//
//					@SuppressWarnings("deprecation")
//					BukkitTask task = plg.getServer().getScheduler().runTaskTimer(plg, timer, 0L, 20L);
//
//					timer.setTask(task);
//
//					return true;
//				}
//			}
		}


		player.getInventory().addItem(new ItemStack(Material.DIAMOND,64));
		return false;
	}
}
