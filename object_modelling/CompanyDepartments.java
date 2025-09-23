
// Problem 3: Company and Departments (Composition)
import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("John"));
        d1.addEmployee(new Employee("Jane"));
        comp.addDepartment(d1);
        System.out.println("Company: " + comp.companyName + " has department " + d1.deptName);
    }
}
