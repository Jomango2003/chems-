package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        String[] message = event.getMessage().getContentRaw().split(" ");

        if(message[0].equalsIgnoreCase("!calculate") && message.length == 1){
            event.getChannel().sendMessage("To use this command, type (w/out brackets): !calculate [add/sub] [first-num] [second-num]").queue();
        }
        else if(message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("add")){
            int firstNum = Integer.parseInt(message[2]);
            int secNum = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (firstNum + secNum)).queue();
        }
        else if(message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("sub")){
            int firstNum = Integer.parseInt(message[2]);
            int secNum = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the resutlt: " + (firstNum - secNum)).queue();
        }
        else if(message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("multiply")){
            int firstNum = Integer.parseInt(message[2]);
            int secNum = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (firstNum * secNum)).queue();
        }
        else if(message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("divide")){
            int firstNum = Integer.parseInt(message[2]);
            int secNum = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + ((double) firstNum / secNum)).queue();
        }
    }
}
