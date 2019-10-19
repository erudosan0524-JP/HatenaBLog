package com.github;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class Main extends JavaPlugin {

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {
		new OnBlockPlace(this);

		getCommand("example").setExecutor(new CommandManager());

		Timer timer = new Timer(this, 10);
		@SuppressWarnings("deprecation")
		BukkitTask task = this.getServer().getScheduler().runTaskTimer(this, timer, 0L, 20L);

		timer.setTask(task);
	}

}
