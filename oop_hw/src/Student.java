package tr.edu.beykoz.oop;  // her dosyanın en üstünde

public class Student {

    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        setGpa(gpa); // validation için setter kullanıyoruz
    }

    // PRIVATE METHOD (only accessible inside this class)
    private boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setGpa(double gpa) {
        if (isValidGpa(gpa)) {   // private method burada kullanılıyor
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}