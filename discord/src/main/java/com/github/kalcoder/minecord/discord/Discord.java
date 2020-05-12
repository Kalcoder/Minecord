package com.github.kalcoder.minecord.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.bukkit.Bukkit;

import javax.security.auth.login.LoginException;
import java.util.logging.Level;

public class Discord {
  
  static JDA bot;
  
  public static void start() {
    try {
      bot = JDABuilder.create(System.getenv("MinecordToken"), GatewayIntent.getIntents(GatewayIntent.DEFAULT))
              .build();
    } catch (LoginException e) {
      Bukkit.getLogger().log(Level.SEVERE, "There was an error initializing the Discord bot...");
      e.printStackTrace();
    }
  }
}
