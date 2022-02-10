package homework5;

import static homework5.Sort.students;


public class Main {

    public static void main(String[] args) {
        students[0] = new Student(340224245, "Nik", "Katrosha", "Sergio",
                "Vysotskogo", 507854617, 2004, "Technology", "First", "First");
        students[1] = new Student(343050333, "Vova", "Semionov", "Alex",
                "Bocharovo", 674567764, 2004, "Technology", "Second", "Second");
        students[2] = new Student(346765753, "Vova", "Petorov", "Vlad",
                "Sachorovo", 974563234, 1999, "Music", "Third", "Fifth");
        students[3] = new Student(856423273, "Piotr", "Kozlov", "Boris",
                "Paustovskogo", 675589622, 2000, "Math", "Second", "Third");
        students[4] = new Student(856423273, "Piotr", "Tula", "Boris",
                "Vysotskogo", 673627543, 2001, "Physic", "Second", "First");
        students[5] = new Student(476355743, "Sasha", "Kuzmenko", "Vova",
                "Bocharovo", 503535765, 2004, "IT", "First", "First");
        students[6] = new Student(637703645, "Igor", "Petrenko", "Nikolay",
                "Paustovskogo", 63633673, 2005, "Scientist", "Forth", "Fifth");
        students[7] = new Student(346343423, "Vasya", "Kutov", "Igor",
                "Vysotskogo", 679305553, 1999, "Physic", "Second", "First");
        students[8] = new Student(533564525, "Oleg", "Gromov", "Vova",
                "Bocharovo", 973576265, 2001, "IT", "First", "First");
        students[9] = new Student(535347093, "Igor", "Stanis", "Nikolay",
                "Paustovskogo", 63234642, 2003, "Scientist", "Forth", "Fifth");
        System.out.println("Students sorted by faculty:");
        Sort.getStudentByFaculty("IT");

        System.out.println("---------------------------------");

        System.out.println("Students sorted by faculty and group");
        Sort.getStudentByFacultyAndGroup("IT", "First");

        System.out.println("---------------------------------");

        System.out.println("Students sorted by year of birth");
        Sort.getStudentByYear(2004);

        System.out.println("---------------------------------");

        System.out.println("Students sorted by group");
        Sort.getStudentByGroup("First");

    }

}