
// Demonstrates proper naming conventions in Java
public class NamingConventions {
    private String studentName;
    private int studentAge;

    public NamingConventions(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + studentName + ", Age: " + studentAge);
    }
}
