package pl.b2bnetwork;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    //Ta metoda ma zwrócić 6 liczbę ciągu Fibonnaciego
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

    //Ta metoda ma zwrócić tablicę z 20 pierwszymi liczbami ciągu Fibonacciego (od 1 do 20 włącznie)
    public List<Integer> returnArrayWith20FibonacciNo() {
        List<Integer> lista = new ArrayList<Integer>();
        int pierwszy = 1;
        int drugi = 1;

        int wynik = 0;

        for (int i = 1; i < 21; i++) {
            wynik = pierwszy + drugi;
            pierwszy = drugi;
            drugi = wynik;
            lista.add(wynik);
        }
        return lista;




    }

    //Ta metoda ma zrócić tablicę z tymi liczbami z 20 pierwszych liczb ciągu Fibonacciego które są podzielne przez 3
    public List<Integer> returnArrayWith20FibonacciNoDivisibleBy3() {
        List<Integer> lista = new ArrayList<Integer>();


        int pierwszy = 1;
        int drugi = 1;

        int wynik = 0;

        for (int i = 1; i < 21; i++) {
            wynik = pierwszy + drugi;
            pierwszy = drugi;
            drugi = wynik;

            wynik = wynik % 3;
            if (wynik == 0) {
                lista.add(wynik);
            }


        }

        return lista;
    }
}
