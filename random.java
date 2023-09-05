
public class random {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", 20);

        // Create Course objects
        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("Computer Science", 202);

        // Display student and course information
        student1.displayInfo();
        System.out.println("Enrolled in:");
        course1.displayInfo();
        course2.displayInfo();
    }
}

