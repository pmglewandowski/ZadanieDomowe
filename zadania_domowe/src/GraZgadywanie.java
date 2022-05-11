import java.util.Random;
import java.util.Scanner;

public class GraZgadywanie {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");
        int x = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Podaj liczbę:");
            x = getNumberFromUser();
            if (x > numberToGuess)
                System.out.println("Podałeś za dużą liczbę");
            else if (x < numberToGuess)
                System.out.println("Podałeś za małą liczbę");
            else {
                System.out.println("Zgadłeś!");
                break;
            }
            System.out.println("Masz jeszcze prób: " + (4 - i));
        }
        if (x != numberToGuess)
            System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);
    }


    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}


