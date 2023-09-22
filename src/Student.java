public class Student {

    private String name;
    private int age;
    private double gpa;

    // constructor
    public Student(String studentName, int studentAge, double studentgpa) {
        name = studentName;
        age = studentAge;
        gpa = studentgpa;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("gpa: " + gpa);
    }
}



