package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InviteCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] message = event.getMessage().getContentRaw().split(" ");
        int timeString = 3600;
        if(message[0].equalsIgnoreCase("!invite") && message.length == 1){
            event.getChannel().sendMessage("To use !invite do: !invite create").queue();
        }else if (message[0].equalsIgnoreCase("!invite") && message.length >= 2 && message[1].equalsIgnoreCase("create")){
            event.getChannel().sendMessage("Hey " + event.getAuthor().getName() + "! You want to invite someone? Cool!").queue();
            event.getChannel().sendMessage("Give them this invite link: " + event.getChannel().createInvite().setMaxAge(timeString).complete().getUrl()).queue();
            event.getChannel().sendMessage("Invite expires in " + timeString + " seconds").queue();
        }
    }

}
