package Task2b;

public class ContractEmployee extends Employee{
    String name;
    int monthlyPayment;
    String federalTaxIdMember;
    public ContractEmployee(String name, int monthlyPayment, String federalTaxIdMember){
        super();
        this.name=name;
        this.monthlyPayment=monthlyPayment;
        this.federalTaxIdMember=federalTaxIdMember;
    }

    @Override
    public String toString() {
        return "id: " + employeeId + ", name: " + name +", Average monthly wage: "+ CalculatePay();
    }
    public int CalculatePay(){
        return monthlyPayment;
    }
}
