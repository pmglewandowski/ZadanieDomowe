public class Multiply {
    public static void main(String[] args) {
        int wynik1 = multiply(1, 2);
        System.out.println(wynik1);
        double wynik2 = multiply(1, 2.33, 3);
        System.out.println(wynik2);
        int wynik3 = multiply(1, 2, 3, 4);
        System.out.println(wynik3);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(int a, double b, double c) {
        return a * b * c;
    }

    public static int multiply(int a, int b, int c, int d) {
        return ((a + b) / 2) * (c + d);
    }
}