package main;

import events.CallCommand;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import javax.security.auth.login.LoginException;


public class BotMain {
    private static JDA jdaEjemplo;

    public static void main(String[] args) throws LoginException {
        jdaEjemplo = new JDABuilder(
                AccountType.BOT)
            .setToken("")
          .build();

        PrefixManager pm = new PrefixManager();
        System.out.println("Bot Iniciado, prefijo: "+pm.getPrefix());

    }


  /**  public void onMessage(GuildMessageReceivedEvent event){
        event.getChannel().sendMessage("ASD").queue();
        System.out.println("asd");

    } /*/

}
