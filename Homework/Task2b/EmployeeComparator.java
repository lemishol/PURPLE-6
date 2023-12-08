package Task2b;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<SalaryCalc> {
    @Override
    public int compare(SalaryCalc o1, SalaryCalc o2) {
        double number1 = o1.CalculatePay();
        double number2 = o2.CalculatePay();

        if (number1 < number2) {
            return 1;
        } else if (number1 > number2) {
            return -1;
        } else {
            return 0;
        }
    }


}