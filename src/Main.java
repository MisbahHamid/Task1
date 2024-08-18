import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalPopulation = 80000;
        double percentageMen = 52.0;
        double percentageLiteracy = 48.0;
        double percentageLiterateMen = 35.0;

        int numberOfMen = (int) (totalPopulation * percentageMen / 100);
        int numberOfWomen = totalPopulation - numberOfMen;

        int numberOfLiteratePeople = (int) (totalPopulation * percentageLiteracy / 100);
        int numberOfIlliteratePeople = totalPopulation - numberOfLiteratePeople;

        int numberOfLiterateMen = (int) (totalPopulation * percentageLiterateMen / 100);

        int numberOfIlliterateMen = numberOfMen - numberOfLiterateMen;
        int numberOfIlliterateWomen = numberOfIlliteratePeople - numberOfIlliterateMen;

        System.out.println("Number of illiterate men: " + numberOfIlliterateMen);
        System.out.println("Number of illiterate women: " + numberOfIlliterateWomen);
    }
}


