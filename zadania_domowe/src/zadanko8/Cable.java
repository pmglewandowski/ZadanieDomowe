package zadanko8;

public class Cable {
    private String type;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

    public Cable(String type, int length) {
        this.type = type;
        this.length = length;
    }

    public void print() {
        System.out.println("kabel typu " + type + " o długości " + length);
    }
}


