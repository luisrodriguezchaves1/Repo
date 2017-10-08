package masterprogramstudio.rememberme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis G on 7/10/2017.
 */

public class values {
    private List<String> messagesEsp;
    private List<String> messagesEng;
    // :D aqui le pongo mi toque a esto
    public values(){
        messagesEsp=new ArrayList<String>();
        messagesEng=new ArrayList<String>();
        cargarMesEsp();
    }

    public void cargarMesEsp(){
        messagesEsp.add("Buenas");
        messagesEsp.add("¿Quieres que te recuerde algo en el futuro?");
        messagesEsp.add("¿Estas seguro de esto?");
        messagesEsp.add("¿Como quieres que te recuerde esto?");
        messagesEsp.add("¿Necesitas llevar algo para esto?");
        messagesEsp.add("¿Si?");
        messagesEsp.add("¿No?");
        messagesEsp.add("¿Donde dejaste ");
        messagesEsp.add("¿No olvidas algo?");
        messagesEsp.add("Acuerdate de llevar ");
        messagesEsp.add("Tienes algo importante para hoy");
        messagesEsp.add("No me olvides :'( ");
        messagesEsp.add("Si tienes que comprar un regalo importante para álguien hoy. \n No lo olvides por favor :3");
        messagesEsp.add("Cuiíate");
        messagesEsp.add("Recuérdenme");
    }

    public void cargarMesEng(){
        messagesEng.add("Greetings");
        messagesEng.add("Do you want me to remember you something in the future?");
        messagesEng.add("Are you sure about this?");
        messagesEng.add("How do I remember you this");
        messagesEng.add("Are you carrying something for this event?");
        messagesEng.add("Yes?");
        messagesEng.add("No?");
        messagesEng.add("where did you leave %s?");
        messagesEng.add("Aren't you forgetting something?");
        messagesEng.add("Remember to take your %s please");
        messagesEng.add("Tienes algo importante para hoy");
        messagesEng.add("Don't forget me:'( ");
        messagesEng.add("If you have to buy an important present for someone today. \n Don't forget it please :3");
        messagesEng.add("Take care");
        messagesEng.add("Remember me");
    }
}
