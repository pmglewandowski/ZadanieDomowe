package zadanko7;

public class Penguin extends Bird {

    int swimmingSpeed;

    public Penguin(String name, int wingspan, int swimmingSpeed) {
        super(name, wingspan, false);
        this.swimmingSpeed = swimmingSpeed;
    }

}
