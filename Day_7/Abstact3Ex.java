abstract class Employee {
    String name;
    int employeeId;
    
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    abstract void calculateSalary();
    
    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private final int salary = 50000;
    
    FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }
    
    
    void calculateSalary() {
        System.out.println("Salary: $" + salary);
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private final int hourlyRate = 500;
    
    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }
    
 
    void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Salary: $" + salary);
    }
}

public class Abstact3Ex {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Ramya", 101);
        emp1.showDetails();
        emp1.calculateSalary();
        
        System.out.println();
        
        PartTimeEmployee emp2 = new PartTimeEmployee("Sharmi", 102, 20);
        emp2.showDetails();
        emp2.calculateSalary();
    }
}
