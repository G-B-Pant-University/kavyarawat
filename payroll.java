class Employee{
    int empId;
    String empName;
    String empDepartment;
    Employee(int empId, String empName, String empDepartment){
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
       
    }
    void displayinfo(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDepartment);
    }
    double calsalary(){
        return 0.0;
    }
}
class Fulltimeemp extends Employee{
    double empbasicSalary;
    double bonus;
    Fulltimeemp(int empId, String empName, String empDepartment, double empbasicSalary,double bonus){
        super(empId, empName, empDepartment);
        this.empbasicSalary = empbasicSalary;
        this.bonus = bonus;
    }
    double calsalary(){
        return empbasicSalary + bonus;
    }
}
class Parttimeemp extends Employee{
    double salaryperhour;
    double hoursWorked;
    Parttimeemp(int empId, String empName, String empDepartment, double salaryperhour,double hoursWorked){
        super(empId, empName, empDepartment);
        this.salaryperhour = salaryperhour;
        this.hoursWorked = hoursWorked;
    }
    double calsalary(){
        return hoursWorked * salaryperhour;
    }
}
public class Payroll {
    public static void main(String[] args) {
        Employee e1 = new Fulltimeemp(1, "John Doe", "IT", 50000, 5000);
        e1.displayinfo();
        System.out.println("Full-time Employee Salary: " + e1.calsalary());
        Employee e2 = new Parttimeemp(2, "Jane Smith", "HR", 20, 25);
        e2.displayinfo();
        System.out.println("Part-time Employee Salary: " + e2.calsalary());
    }
}
