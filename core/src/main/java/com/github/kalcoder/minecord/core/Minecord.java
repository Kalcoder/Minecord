package com.github.kalcoder.minecord.core;

import com.github.kalcoder.minecord.discord.Discord;
import com.github.kalcoder.minecord.minecraft.Minecraft;
import org.bukkit.plugin.java.JavaPlugin;

public final class Minecord extends JavaPlugin {
  
  @Override
  public void onEnable() {
    Minecraft.start();
    Discord.start();
  }
  
  @Override
  public void onDisable() {
  
  }
}
