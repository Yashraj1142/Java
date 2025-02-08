class University {
    static String universityName = "UPES";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void dispUniName() {
        System.out.println("University Name: " + universityName);
    }

    void dispStudName() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }
}

public class UniversityCase {
    public static void main(String[] args) {
        University.dispUniName();

        University s1 = new University("Alice");
        University s2 = new University("Bob");
        University s3 = new University("Charlie");

        s1.dispStudName();
        s2.dispStudName();
        s3.dispStudName();

        University.universityName = "MIT";

        s1.dispStudName();
        s2.dispStudName();
        s3.dispStudName();
    }
}
