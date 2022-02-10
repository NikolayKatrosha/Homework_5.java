package homework5;


public class Sort {


    static Student[] students = new Student[10];

    public static void getAllStudents() {
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }
    }

    public static void getStudentByFaculty(String faculty) {

        for (Student student : students) {
            if (faculty.equals(student.getFaculty())) {
                System.out.println((student));
            }
        }
    }


    public static void getStudentByFacultyAndGroup(String faculty, String group) {
        for (Student student : students) {
            if ((faculty.equals(student.getFaculty())) && (group.equals(student.getGroup()))) {
                System.out.println(student);
            }
        }
    }


    public static void getStudentByYear(int year) {
        for (Student student : students) {
            if (year == student.getYearOfBirth()) {
                System.out.println(student);
            }
        }
    }

    public static void getStudentByGroup(String group) {
        for (Student student : students) {
            if (group.equals(student.getGroup())) {
                System.out.println(student);
            }
        }
    }
}

