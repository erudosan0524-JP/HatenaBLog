package com.github;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class Timer extends BukkitRunnable{

	private int time;
	private JavaPlugin plg;
	private BukkitTask task;

	public Timer(JavaPlugin plg, int time) {
		this.plg = plg;
		this.time = time;
	}

	public void run() {
		if(time <= 0) {
			//タイムが0以下==タイムアップになったとき
			//「タイムアップ」と出力
			plg.getServer().broadcastMessage("タイムアップ！");
			//自分自身（スケジューラ）を止める
			plg.getServer().getScheduler().cancelTask(task.getTaskId());
		} else {
			//タイムが0以上==タイマーが稼働している時
			//現在のタイムを表示
			plg.getServer().broadcastMessage("タイム: " + time);
		}
		time--;
	}

	public void setTask(BukkitTask task) {
		this.task = task;
	}

}
