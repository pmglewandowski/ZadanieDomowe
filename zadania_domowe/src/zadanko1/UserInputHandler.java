package zadanko1;

import java.util.Scanner;

public class UserInputHandler {
    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
