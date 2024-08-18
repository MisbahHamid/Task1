import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be withdrawn (in hundreds): ");
        int amountInHundreds = scanner.nextInt();

        int amount = amountInHundreds * 100;

        int numHundredNotes = amount / 100;
        amount = amount % 100;

        int numFiftyNotes = amount / 50;
        amount = amount % 50;

        int numTenNotes = amount / 10;
        amount = amount % 10;

        System.out.println("Number of 100-unit notes: " + numHundredNotes);
        System.out.println("Number of 50-unit notes: " + numFiftyNotes);
        System.out.println("Number of 10-unit notes: " + numTenNotes);

        scanner.close();
    }
}


