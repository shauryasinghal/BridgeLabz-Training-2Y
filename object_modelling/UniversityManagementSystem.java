
// Self Problem 5: University Management System
import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class CourseU {
    String title;
    Professor professor;
    List<StudentU> students = new ArrayList<>();
    CourseU(String title) { this.title = title; }
    void assignProfessor(Professor p) { this.professor = p; }
    void enroll(StudentU s) { students.add(s); }
}

class StudentU {
    String name;
    StudentU(String name) { this.name = name; }
    void enrollCourse(CourseU c) {
        c.enroll(this);
        System.out.println(name + " enrolled in " + c.title);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        StudentU s = new StudentU("Karan");
        Professor p = new Professor("Dr. Verma");
        CourseU c = new CourseU("DSA");
        c.assignProfessor(p);
        s.enrollCourse(c);
    }
}
