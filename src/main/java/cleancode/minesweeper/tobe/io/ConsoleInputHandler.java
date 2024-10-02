package cleancode.minesweeper.tobe.io;

import java.util.Scanner;

public class ConsoleInputHandler {

    public final Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        return scanner.nextLine();
    }
}
