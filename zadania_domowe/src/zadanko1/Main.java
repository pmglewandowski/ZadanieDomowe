package zadanko1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proszę wybierz działanie ");
        Menu.printOptions();
        int option = UserInputHandler.getNumberFromUser();
        System.out.println("Proszę podaj pierwszą liczbę ");
        int number1 = UserInputHandler.getNumberFromUser();
        System.out.println("Proszę podaj drugą liczbę ");
        int number2 = UserInputHandler.getNumberFromUser();

        switch (option) {
            case 1:
                System.out.println(" Wynik dodawania to: " + Calculator.add(number1, number2));
                break;
            case 2:
                System.out.println(" Wynik odejmowania to " + Calculator.substract(number1, number2));
                break;
            default:
                System.out.println(" Wybrałeś zly numer, proszę wybierz numer 1 lub 2");

        }

    }
}
