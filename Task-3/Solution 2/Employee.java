public class Employee implements Taxable{
    int empID;
    String name;
    double salary;
    public Employee() {

    }
    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }


    public void calcTax() {
        double taxAmount = salary * incomeTax;
        System.out.println("Income tax amount for " + empID +", " + name + " is " + taxAmount);
    }
}