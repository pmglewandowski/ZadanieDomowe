public class Dimensions {
    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTrankCapacity() {
        return trankCapacity;
    }

    public Dimensions(int high, int width, int trankCapacity) {
        this.high = high;
        this.width = width;
        this.trankCapacity = trankCapacity;
    }

   private int high;
   private int width;
   private int trankCapacity;
}
