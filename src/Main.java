//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalDistance=2614;
        int meters = totalDistance*1000;
        int feet = totalDistance*3280;
        int inches = totalDistance*39370;
        int centimeters = totalDistance*100000;
        System.out.println("Total distance" + totalDistance);
        System.out.println("distance in meter is " + meters);
        System.out.println("distance in feet is " + feet);
        System.out.println("distance in inches is " + inches);
        System.out.println("distance in centimeters is " + centimeters);
    }
}