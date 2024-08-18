import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total selling price of 15 items: ");
        double totalSellingPrice = scanner.nextDouble();


        double profitPercentage = 20.0;


        double totalCostPrice = totalSellingPrice / (1 + profitPercentage / 100);

        double costPricePerItem = totalCostPrice / 15;


        System.out.println("The cost price of one item is: " + costPricePerItem);


        scanner.close();
    }
}


