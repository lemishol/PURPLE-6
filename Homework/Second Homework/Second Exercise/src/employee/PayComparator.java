package employee;
import java.util.Comparator;

public class PayComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)o2.caclulatePay() - (int)o1.caclulatePay();
    }
}
