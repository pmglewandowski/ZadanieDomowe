package zadanko9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actor chrisevans = new Actor("Chris", "Evans");
        Actor robertdj = new Actor("Robert", "Junior");
        Actor scarlettjohannson = new Actor("Scarlet", "Johhansson");


        List<Actor> actorsinfilm = new ArrayList<>();
        actorsinfilm.add(chrisevans);
        actorsinfilm.add(robertdj);
        actorsinfilm.add(scarlettjohannson);

        Director ktostam = new Director("Dobry", "Reżyser");

        Movie ironMan = new Movie("IronMan", 2002, ktostam, actorsinfilm);
        System.out.println(ironMan);
    }


}
