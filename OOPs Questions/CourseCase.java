class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void dispCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

public class CourseCase {
    public static void main(String[] args) {
        Course course1 = new Course("OOPs", "OOP123");
        course1.dispCourseDetails();
    }
}
