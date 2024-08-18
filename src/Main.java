import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive number (base): ");
        double base = scanner.nextDouble();


        System.out.print("Enter the second positive number (exponent): ");
        double exponent = scanner.nextDouble();
        double result= Math.pow(base,exponent);


        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}


