public class Fibonacci {

    public int return6FibonacciNo() {
        int pierwszy = 0;
        int drugi = 1;

        int wynik = 0;

        for (int i = 2; i < 7; i++) {
            wynik = pierwszy + drugi;
            pierwszy = drugi;
            drugi = wynik;
        }
        return wynik;
    }
}
