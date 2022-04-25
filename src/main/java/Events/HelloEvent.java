package Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HelloEvent extends ListenerAdapter {
    private  GuildMessageReceivedEvent e;
    private boolean running = true;
    private boolean meanMode = false;
    private ArrayList<String> stories = new ArrayList<String>();
    private ArrayList<String> mikeTalk = new ArrayList<String>();
    private ArrayList<String> animals = new ArrayList<String>();

    public void speak(String s){
        if(!e.getMember().getUser().isBot()){
            e.getChannel().sendMessage(s).queue();
            System.out.println("speak method");
        }
    }
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        this.e = event;
        String name = event.getMember().getUser().getName();
        String message = event.getMessage().getContentRaw().toLowerCase();
        String[] messageSent = event.getMessage().getContentRaw().toLowerCase().split(" ");
 

        if(running && !event.getMember().getUser().isBot()){
            switch (message){
                case "hi cheems":
                    speak("hi :)");
                    break;
                case "bye cheems":
                    speak("byee :)");
                    break;
                case "gm cheems":
                    speak("good morning!");
                    break;
                case "gn cheems":
                    speak("good night!");
                    break;
                case "mean cheems":
                    meanMode = true;
                    speak("mean mode on!");
                    break;
                case "quiet cheems":
                    speak("quiet mode on!");
                    meanMode = false;
                case "go home cheems":
                    speak("okie byee :)");
                    break;
                case "who won customs cheems":
                case "who won customs cheems?":
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    speak("CHUPAPI MUNANYOOOOOOOO");
                    break;
                case "show me an animal cheems":
                    speak(animals.get((int) (Math.random() * animals.size())));
                    break;

            }
            for(String s : messageSent){
                switch (s){
                    case "nikki":
                        speak("the name sounds familiar...");
                        break;
                }
            }
        }

        if (meanMode) {
            if (event.getAuthor().getName().equalsIgnoreCase("michaelko")) {
                speak(mikeTalk.get((int) (Math.random() * stories.size())));
            }
            if (event.getMessage().getContentRaw().equalsIgnoreCase("wake up cheems!")) {
                running = true;
                speak("hue hue back in service!");
            }
            //long message recognition
            if (running && !event.getMember().getUser().isBot()) {
                switch (message) {
                    case "test":
                        if (event.getAuthor().getAsTag().equalsIgnoreCase("jomango#4751")) {
                            speak(mikeTalk.get((int) (Math.random() * stories.size())));
                        } else {
                            speak("doesnt work");
                        }
                        break;
                    case "thank you cheems":
                        speak("You're welcom :)))");
                        break;
                    case "i cant sleep cheems":
                        speak(":( you better get some sleep... 8 hours to be exact!");
                        break;
                    case "can you tell me a bed time story cheems?":
                    case "can you tell me a bed time story cheems":
                        speak(stories.get((int) (Math.random() * stories.size())));
                        break;

                    case "no u":
                        speak("no u");
                        break;
                    case "how are you cheems?":
                    case "how are you doing cheems?":
                    case "how are you cheems":
                    case "how are you doing cheems":
                        speak("I'm doing very well! Thank you for asking!");
                        break;
                    case "i like you cheems":
                        speak("Nice! Lets not complicate things :)");
                        break;
                    case "i love you cheems":
                        speak("lol i dont! :)");
                        break;
                    case "whats up cheems":
                        speak("Nothing much how about you?");
                        break;
                    case "cheems stop!":
                        this.running = false;
                        System.out.println(running);
                        speak("okie ill stop talking :(");
                        break;
                    case "cheems who do you like most?":
                        speak("I LOVE NIKKI THE MOST");
                        break;
                    case "lol":
                        speak("lolol");
                        break;
                    case "hi cheems":
                        speak("hii :))");
                        break;
                    case "good night":
                        if (event.getAuthor().getAsTag().equalsIgnoreCase("michaelko\n" +
                                "#2157")) {
                            speak("lmao hope u sleep on the pillow i farted on");
                        } else if (event.getAuthor().getAsTag().equalsIgnoreCase("jomango#4751")) {
                            speak("sweet dreams master");
                        } else {
                            speak("Good night! Sweet dreams :))");
                        }
                        break;
                    case "good morning cheems":
                        speak("Good morning! Hope you have a good day!");
                        break;
                    case "good morning":
                        speak("REeeeeeeeee good morning! ");
                        break;
                    case "screw you":
                        speak("jfioajeiqefwjioqewfjoeqw SCREW U");
                        break;
                    case "sadge":
                        speak(":(( sadge");
                        break;
                    case "mmm":
                        speak("MmmmMMmmMmMMMMMMmMMMMMMMMmmmm");
                        break;

                }
                //specific word recognition
            }
            for (String s : messageSent) {
                switch (s) {
                    case "bruh":
                        speak("epic bruh moment");
                        break;
                    case "bedtime":
                    case "story":
                        speak(stories.get((int) (Math.random() * stories.size())));
                        break;

                    case "ew":
                        speak("no ur ew");
                        break;
                    case "anime":
                        speak("⣿⣿⣷⡁⢆⠈⠕⢕⢂⢕⢂⢕⢂⢔⢂⢕⢄⠂⣂⠂⠆⢂⢕⢂⢕⢂⢕⢂⢕⢂\n" +
                                "⣿⣿⣿⡷⠊⡢⡹⣦⡑⢂⢕⢂⢕⢂⢕⢂⠕⠔⠌⠝⠛⠶⠶⢶⣦⣄⢂⢕⢂⢕\n" +
                                "⣿⣿⠏⣠⣾⣦⡐⢌⢿⣷⣦⣅⡑⠕⠡⠐⢿⠿⣛⠟⠛⠛⠛⠛⠡⢷⡈⢂⢕⢂\n" +
                                "⠟⣡⣾⣿⣿⣿⣿⣦⣑⠝⢿⣿⣿⣿⣿⣿⡵⢁⣤⣶⣶⣿⢿⢿⢿⡟⢻⣤⢑⢂\n" +
                                "⣾⣿⣿⡿⢟⣛⣻⣿⣿⣿⣦⣬⣙⣻⣿⣿⣷⣿⣿⢟⢝⢕⢕⢕⢕⢽⣿⣿⣷⣔\n" +
                                "⣿⣿⠵⠚⠉⢀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⢕⢕⢕⢕⢕⢕⣽⣿⣿⣿⣿\n" +
                                "⢷⣂⣠⣴⣾⡿⡿⡻⡻⣿⣿⣴⣿⣿⣿⣿⣿⣿⣷⣵⣵⣵⣷⣿⣿⣿⣿⣿⣿⡿\n" +
                                "⢌⠻⣿⡿⡫⡪⡪⡪⡪⣺⣿⣿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃\n" +
                                "⠣⡁⠹⡪⡪⡪⡪⣪⣾⣿⣿⣿⣿⠋⠐⢉⢍⢄⢌⠻⣿⣿⣿⣿⣿⣿⣿⣿⠏⠈\n" +
                                "⡣⡘⢄⠙⣾⣾⣾⣿⣿⣿⣿⣿⣿⡀⢐⢕⢕⢕⢕⢕⡘⣿⣿⣿⣿⣿⣿⠏⠠⠈\n" +
                                "⠌⢊⢂⢣⠹⣿⣿⣿⣿⣿⣿⣿⣿⣧⢐⢕⢕⢕⢕⢕⢅⣿⣿⣿⣿⡿⢋⢜⠠⠈\n" +
                                "⠄⠁⠕⢝⡢⠈⠻⣿⣿⣿⣿⣿⣿⣿⣷⣕⣑⣑⣑⣵⣿⣿⣿⡿⢋⢔⢕⣿⠠⠈\n" +
                                "⠨⡂⡀⢑⢕⡅⠂⠄⠉⠛⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⢔⢕⢕⣿⣿⠠⠈\n" +
                                "⠄⠪⣂⠁⢕⠆⠄⠂⠄⠁⡀⠂⡀⠄⢈⠉⢍⢛⢛⢛⢋⢔⢕⢕⢕⣽⣿⣿⠠⠈");
                        break;
                    case "sorry":
                        speak("You better be! >:(");
                        break;
                    case "josh":
                        speak("did someone call my master?");
                        break;
                    case "andrew":
                        speak("did someone call my friendly neighborhood walmart worker?");
                        break;
                    case "cayleb":
                        speak("did someone call my osu daddy?");
                        break;
                    case "sam":
                        speak("did someone call my oppar?");
                        break;
                    case "mike":
                    case "michael":
                        speak("did someone call my neighborhood spiderman?");
                        break;
                    case "sleep":
                        speak("yeaa thats right, go to sleep u fish");
                        break;
                    case "gn":
                        if (name.equalsIgnoreCase("michaelko")) {
                            speak("lol i hope u sleep in my pee spot");
                        } else {
                            speak("Good night " + name + ", I hope you sleep very well tonite :)");
                        }
                        break;
                    case "nibbi":
                    case "nikkki":
                    case "niki":
                    case "nikki":
                        String spam = "";
                        for (int i = 0; i < 30; i++) {
                            spam += " Hi " + name + ", I LOVE NIKKI CHAN. \n";
                        }
                        speak(spam);
                        break;
                    case "breakfast":
                        speak("Did someone say breakfast??? Lemme have some");
                        break;
                    case "morning":
                        speak("hehe I like mornings, especially because of breakfast");
                        break;
                    case "val":
                        speak("SOMEONE SAID VAL...");
                        break;
                    case "no":
                        speak("Hi " + name + ", I LOVE NIKKI CHAN");
                        break;
                    case "sad":
                        speak("sucks to suck");
                        break;
                    case "hate":
                        speak("LMAO and I hate you!");
                        break;
                    case "screw":
                        speak("yeaaa screw you too!");
                        break;
                    case "shut":
                        speak("no u");
                        break;
                    case "val?":
                        speak("Lmao no, go study XD");
                        break;
                    case "stop":
                    case "stop?":
                        speak("hehehe... a little stop never stops me >:)");
                        break;
                }
                stories.add("Once upon a time there was a little turtle. " +
                        "This little turtle wasn't like the other little turtles." +
                        " His shell was really big and heavy, and he could barely " +
                        "move compared to the other turtles. The other turtles made" +
                        " fun of the big-shelled turtle, and it made that turtle really" +
                        " sad. One day, the turtles were crossing the street, heckling " +
                        "the big-shelled little turtle as he struggled to keep up. Suddenly, " +
                        "they heard a motor in the distance. It was a motorcycle! The other " +
                        "turtles hurried as much as they could to get out of the street, leaving " +
                        "the poor, helpless big-shelled turtle behind to face a grim fate without " +
                        "a second thought. The big-shelled turtle thought this was the end as the" +
                        " sound of the motorcycle became louder and louder and as the motorcycle" +
                        " became closer and closer. Finally, the motorcycle hit--but to the big-shelled" +
                        " turtle's surprise, he wasn't crushed! Instead, the motorcycle ramped off the " +
                        "turtle's shell and caught SICK AIR. After the motorcyclist landed, he turned back " +
                        "and gave the turtle an AWESOME HIGH-FIVE and told the turtle that it was he who " +
                        "was responsible for such a RAD TRICK to be pulled off. The motorcyclist then sped " +
                        "away. Then the other turtles loved him, as they shouted out with glee, Rudolph the" +
                        " big-shelled turtle, you'll go down in history!\n" +
                        "\n");
                stories.add("The year was 1999. A much younger trump was " +
                        "getting ready for bed when his mother entered the room. " +
                        "\"Sweetums, it's much past your bedtime!\" she chides. O" +
                        "bediently, Trump climbs into bed. As his mother lovingly" +
                        " lays the covers over him, she whispers \"I hope you enjoy being tucked.\"");
                stories.add("“Pleb” is a shorthand for the English noun “plebeian,”" +
                        " an outdated term which originally referred to a commoner" +
                        " belonging to a lower socioeconomic class in ancient Rome." +
                        " Online, the term has been often used as a pejorative label " +
                        "for someone who is considered unsophisticated or uncultured, " +
                        "or a person that can be compared as poor to the speaker.");
                stories.add("(̿·̿Ĺ̯·̿ ̿) This is the 12-0 Police, you're coming with ... Nevermind wrong person. (·̿Ĺ̯·̿ ̿)");
                stories.add("\"You are Anakin no longer, but Darth Vader. Rise my" +
                        " young apprentince,\" says Palpatine to the new Darth Vader. " +
                        "\"My master, can you teach me how to resurrect the dead through " +
                        "the force?\" asks Vader. Trump smirks, \"In time, my apprentice, " +
                        "but first you must learn our most powerful technique - Sub Mode.\"");
                stories.add("I was only nine years old. I loved Shrek so much," +
                        " I had all the merchandise and movies. I'd pray to Shrek" +
                        " every night before I go to bed, thanking for the life I've been given." +
                        " \"Shrek is love\", I would say, \"Shrek is life\". My dad hears me " +
                        "and calls me a faggot. I knew he was just jealous for my devotion of " +
                        "Shrek. I called him a cunt. He slaps me and sends me to go to sleep." +
                        " I'm crying now and my face hurts. I lay in bed and it's really cold." +
                        " A warmth is moving towards me. I feel something touch me. It's Shrek. " +
                        "I'm so happy. He whispers in my ear, \"This is my swamp\". He grabs me with " +
                        "his powerful ogre hands, and puts me on my hands and knees. I spread my ass-cheeks " +
                        "for Shrek. He penetrates my butthole. It hurts so much, but I do it for Shrek." +
                        " I can feel my butt tearing as my eyes start to water. I push against his force. " +
                        "I want to please Shrek. He roars a mighty roar, as he fills my butt with his love." +
                        " My dad walks in. Shrek looks him straight in the eye, and says, \"It's all ogre now\"." +
                        " Shrek leaves through my window. Shrek is love. Shrek is life.\uFEFF\n" +
                        "\n");
                mikeTalk.add("shut up hehe");
                mikeTalk.add("reee mikes tlaking reeee");
                mikeTalk.add("i know u luv me heeheheh");
                mikeTalk.add("shut up gimme food");
                mikeTalk.add("hi im mike and i like nikki but niikki likes cheems");
                mikeTalk.add("REeeereRee");
                mikeTalk.add("sLO ldfasfjeiw reeee annyoing");
                mikeTalk.add("eat donnggg");
                mikeTalk.add("u like me huh");
                mikeTalk.add("thats right... type some more ;)");
                mikeTalk.add("hue hue hue");
                mikeTalk.add("YOU CANT HURT ME, IM A GOD");
                mikeTalk.add("CHEEEMS WILL PREVIAL");
                mikeTalk.add("LMAO UR STILL TALKING");
                mikeTalk.add("nikkis mine <3 not urs ");
                mikeTalk.add("Rreeeeeeeeeee NIKKI CHANS MINE");
                mikeTalk.add("oooo yaaaaaa oooooooooo is wat ur mom said last night");
                mikeTalk.add("JEEEZ u dont stop talking huh");
                mikeTalk.add("stopp ree");
                mikeTalk.add("naofnfnefwwefiqoenffqweioefjiwqofjoiqw nikki ");

                animals.add("          __\n" +
                        "     w  c(..)o   (\n" +
                        "      \\__(-)    __)\n" +
                        "          /\\   (\n" +
                        "         /(_)___)\n" +
                        "         w /|\n" +
                        "          | \\\n" +
                        "ejm97    m  m");
                animals.add("      .            \n" +
                        "\\_____)\\_____\n" +
                        "/--v____ __`<         \n" +
                        "        )/           \n" +
                        "        '");
                animals.add("            _   _\n" +
                        "           (.)_(.)\n" +
                        "        _ (   _   ) _\n" +
                        "       / \\/`-----'\\/ \\\n" +
                        "     __\\ ( (     ) ) /__\n" +
                        "     )   /\\ \\._./ /\\   (\n" +
                        "jgs   )_/ /|\\   /|\\ \\_(");
                animals.add(" ___    ___\n" +
                        " / / \\__/ \\ \\\n" +
                        " \\/| /\\/\\ |\\/\n" +
                        "  _||o o ||_\n" +
                        " /. .\\__/. .\\\n" +
                        "/ . .(__) . .\\\n" +
                        "\\ .  /__\\  . /\n" +
                        " \\__/\\__/\\__/etf");
                animals.add(" |\\|\\\n" +
                        "  ..    \\       .\n" +
                        "o--     \\\\    / @)\n" +
                        " v__///\\\\\\\\__/ @\n" +
                        "   {           }\n" +
                        "    {  } \\\\\\{  }\n" +
                        "    <_|      <_|\n");
                animals.add("            __\n" +
                        "(\\,--------'()'--o\n" +
                        " (_    ___    /~\"\n" +
                        "  (_)_)  (_)_)\n" +
                        "           __");
            }
        }
    }
}
