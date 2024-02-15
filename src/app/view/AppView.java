package app.view;
import java.util.Scanner;
public class AppView {
    private final Scanner scanner = new Scanner(System.in);

    public void showText(String txt) {

        System.out.println(txt);
    }

    public int chooseUser(){
        int input;

        showText("Введіть порядковий номер користувача, для перегляду повної інформації:");
        try {
            input = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            input = 1;
        }

        return input - 1;
    }
}
