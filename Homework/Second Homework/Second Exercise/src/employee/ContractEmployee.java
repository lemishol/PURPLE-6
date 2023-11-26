package employee;

public class ContractEmployee extends Employee {
    private String federalTaxIdNumber;
    private double monthlyPayment;
    public ContractEmployee(String name, String employeeId, String federalTaxIdNumber, double monthlyPayment){
        this.name=name;
        this.employeeId=employeeId;
        this.federalTaxIdNumber=federalTaxIdNumber;
        this.monthlyPayment=monthlyPayment;
    }

    public String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }

    public void setFederalTaxIdNumber(String federalTaxIdNumber) {
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double caclulatePay() {
        return monthlyPayment;
    }
    @Override
    public String toString(){
        return "Id: " + this.employeeId + ". Name: " + this.name + ". Monthly wage: " + this.caclulatePay() +".";
    }
}
