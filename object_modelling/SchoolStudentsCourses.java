
// Self Problem 1: School and Students with Courses (Association + Aggregation)
import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();
    Course(String courseName) {
        this.courseName = courseName;
    }
    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    void viewCourses() {
        System.out.println(name + " enrolled in: ");
        for (Course c : courses) System.out.println(c.courseName);
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();
    School(String schoolName) {
        this.schoolName = schoolName;
    }
    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("DPS");
        Student s1 = new Student("Aman");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        school.addStudent(s1);

        s1.viewCourses();
    }
}
