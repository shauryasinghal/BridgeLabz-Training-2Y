
// Self Problem 2: University with Faculties and Departments (Composition + Aggregation)
import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class DepartmentU {
    String deptName;
    DepartmentU(String deptName) { this.deptName = deptName; }
}

class University {
    String uniName;
    List<DepartmentU> departments;
    List<Faculty> faculties;

    University(String uniName) {
        this.uniName = uniName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(DepartmentU d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University u = new University("IIT");
        u.addDepartment(new DepartmentU("CSE"));
        u.addFaculty(new Faculty("Dr. Sharma"));

        System.out.println(u.uniName + " has departments and faculties added.");
    }
}
