package zadanko7;

public class Eagle extends Bird {
    int clawsLength;

    public Eagle(String name, int wingspan, int clawsLength) {
        super(name, wingspan, true);
        this.clawsLength = clawsLength;
    }
}
