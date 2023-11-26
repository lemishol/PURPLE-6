package employee;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double hourlyRate;
    private double hours;
    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double hourlyRate, double hours){
        this.name=name;
        this.employeeId=employeeId;
        this.socialSecurityNumber=socialSecurityNumber;
        this.hourlyRate=hourlyRate;
        this.hours=hours;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double caclulatePay() {
        return hourlyRate*hours;
    }
    @Override
    public String toString(){
        return "Id: " + this.employeeId + ". Name: " + this.name + ". Monthly wage: " + this.caclulatePay() +".";
    }
}
