//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double basicSalary=105000;
        double dearness_allowance =0.40*basicSalary;
        double house_rent=0.20*basicSalary;
        double grossSalary = dearness_allowance+ house_rent;
        System.out.println("the Total Salary = " + basicSalary);
        System.out.println(" house_rent = " + grossSalary);
        System.out.println("dearnessAllowance = " + grossSalary);
        System.out.println("the gross salary = " + grossSalary);

    }
}