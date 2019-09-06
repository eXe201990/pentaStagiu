package BoardMessage;

import java.util.ArrayList;
import java.util.List;

abstract class Board {

    private static List<Messages> messages = new ArrayList<>();


    public static void addMessage(Messages message){

        messages.add(message);
    }

    public static void showMessages(){

        for(Messages message : messages){
            System.out.println("USER: " + message.getUser().getName() + " said" + message.getMessage());

        }
    }

}
