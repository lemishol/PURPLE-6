package employee;

public abstract class Employee implements Payable{
    protected String employeeId;
    protected String name;
    public String getEmployeeId(){
        return this.employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
interface Payable{
    double caclulatePay();
}
