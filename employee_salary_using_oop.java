class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 35000);

        emp.display();
    }
}
