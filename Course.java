
public class Course {
    public String courseName;
    public int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

