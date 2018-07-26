package cn.mcwhirl.Math;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) 
	{
		if(sender instanceof Player)
		{				
			Player player = (Player) sender;
			if(args.length != 3)
			{
				player.sendMessage("§cCorrect usage: /math type number1 number2");
				return true;
			}
			
			String add = args[0];
		    String first = args[1];
		    String second = args[2];
		    
			int oneInt = Integer.parseInt(first);
		    int threeInt = Integer.parseInt(second);
		    
		    if(add.equals("+"))
		    {
		    	player.sendMessage("§b-----------------------------------------------------");
		        player.sendMessage(" §e§l➢ §f简易计算器 §7- §a加法");
		        player.sendMessage(" ");
		    	player.sendMessage(" §e§l➢ §7计算结果为 §a" + (oneInt + threeInt));
		    	player.sendMessage("§b-----------------------------------------------------");
		    }
		    else if(add.equals("-"))
		    {
		    	player.sendMessage("§b-----------------------------------------------------");
	            player.sendMessage(" §e§l➢ §f简易计算器 §7- §a减法");
	            player.sendMessage(" ");
	    	    player.sendMessage(" §e§l➢ §7计算结果为 §a" + (oneInt - threeInt));
	    	    player.sendMessage("§b-----------------------------------------------------");
		    }
	    	else if(add.equals("/"))
	    	{
		    	player.sendMessage("§b-----------------------------------------------------");
                player.sendMessage(" §e§l➢ §f简易计算器 §7- §a除法");
                player.sendMessage(" ");
    	        player.sendMessage(" §e§l➢ §7计算结果为 §a" + ((float)oneInt / threeInt));
    	        player.sendMessage("§b-----------------------------------------------------");
	    	}
    	    else if(add.equals("*"))
    	    {
		    	player.sendMessage("§b-----------------------------------------------------");
                player.sendMessage(" §e§l➢ §f简易计算器 §7- §a乘法");
                player.sendMessage(" ");
	            player.sendMessage(" §e§l➢ §7计算结果为 §a" + ((float)oneInt * threeInt));
	            player.sendMessage("§b-----------------------------------------------------");
    	    }
    	    else
    	    	player.sendMessage("§cCorrect usage: /math type number1 number2");
		}
		// TODO 自动生成的方法存�?
		return true;
	}

}
