package Task2b;

public class Employee implements SalaryCalc {
    String employeeId;
    static int counter=0;
    public Employee(){
        this.employeeId= String.valueOf(counter);
        counter+=1;
    };

    @Override
    public int CalculatePay() {
        return 0;
    }
}
