package Task2b;

public class SalariedEmployee extends Employee{
    String name;
    int paymentPerHour;
    int hours;
    String socialSecurityNumber;
    public SalariedEmployee(String name, int paymentPerHour, int hours, String socialSecurityNumber){
        super();
        this.name=name;
        this.paymentPerHour=paymentPerHour;
        this.hours=hours;
        this.socialSecurityNumber=socialSecurityNumber;
    }
    @Override
    public String toString() {
        return "id: " + employeeId + ", name: " + name +", Average monthly wage: "+ CalculatePay();
    }
    public int CalculatePay(){
        return paymentPerHour*hours;
    }
}
