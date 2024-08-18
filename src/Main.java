import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 12345;

        int digit1 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        int digit4 = number % 10;
        number = number / 10;

        int digit5 = number % 10;

        int sum = digit1 + digit2 + digit3 + digit4 + digit5;

        System.out.println("The sum of the digits is: " + sum);
    }
}


