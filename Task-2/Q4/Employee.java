public class Employee extends Person {
    String employeeId;
    String Designation;
    int Salary;
    
    public Employee(){

    }
    public Employee(String name, String EmployeeId, String Designation, int age, int Salary) {
        super(name,age);
        this.employeeId = employeeId;
        this.Designation = Designation;
        this.Salary = Salary;
    }

    public void employeeDetails() {
        System.out.println("Employee Name "+name+" and age is "+age);
        System.out.println("My Employee ID is "+employeeId);
        System.out.println("I have salary of "+Salary);
    }

}
