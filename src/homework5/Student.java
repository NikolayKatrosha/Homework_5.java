package homework5;

public class Student {


    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String address;
    private long phoneNumber;
    private int yearOfBirth;
    private String faculty;
    private String course;
    private String group;


    Student(int id, String name, String surname, String fatherName, String address,
            long phoneNumber, long yearOfBirth, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = (int) yearOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {this.fatherName = fatherName; }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }




    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", yearOfBirth=" + yearOfBirth +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';

    }
}