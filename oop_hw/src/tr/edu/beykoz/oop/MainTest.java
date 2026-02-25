public class MainTest {

    public static void main(String[] args) {

        // Student object created with your information
        Student student = new Student("Zeynep Rümeysa Kemal", 20, 3.5);

        // Display information
        student.displayInfo();

        // Example: Update GPA
        student.setGpa(3.8);

        System.out.println("After GPA update:");
        System.out.println("Name: " + student.getName());
        System.out.println("GPA: " + student.getGpa());

        // Student ID (extra print as requested)
        System.out.println("Student ID: 2204012314");
    }
}