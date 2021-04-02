import Commands.Calculate;
import Commands.InviteCommand;
import Events.CategoryCreate;
import Events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main(String args[])throws Exception{


        JDA jda = JDABuilder.createDefault("ODE4Mzk1NzUwODgyMzQ0OTgy.YEXccA.lKVWUiZ9lIzOx8ovsBPYtG-eyU0").build();
        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new CategoryCreate());
        jda.addEventListener(new Calculate());
        jda.addEventListener(new InviteCommand());
        jda.addEventListener(new PlayMusic());
    }
}
