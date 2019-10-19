package com.github;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {
		new OnBlockPlace(this);

		getCommand("example").setExecutor(new CommandManager());
	}

}
