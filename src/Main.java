//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int TotalMarks=100;
        int subject1= 80;
        int subject2=90;
        int subject3=75;
        int subject4=60;
        int subject5=100;
        int total = subject1+subject2+subject3+subject3+subject4+subject5;
        int aggregate=0;
        aggregate+=total;
        int percentage =total*100/100;
        System.out.println("the total marks are" + TotalMarks);
        System.out.println("Aggrigate is " + aggregate);
        System.out.println("Percentage is " + percentage);
    }
}