package cn.mcwhirl.Math;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		Bukkit.getConsoleSender().sendMessage("[¼ÆËãÆ÷] Æô¶¯");
		this.getCommand("math").setExecutor(new CommandManager());
	}

}
