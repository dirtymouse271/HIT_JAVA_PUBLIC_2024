import java.util.Scanner;

class School{
    private String schoolName;
    private String date;


    public School(String name, String date) {
        this.schoolName = name;
        this.date = date;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        this.schoolName = sc.nextLine();
        this.date = sc.nextLine();
    }
    public void output(){
        System.out.printf("schoolName "+ this.schoolName);
        System.out.printf("date "+ this.date);
    }
}
class Faculty {
    private String facultyName;
    private String date;
    private School school;

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.facultyName = sc.nextLine();
        this.date = sc.nextLine();
        this.school.input();
    }

    public void output() {
        System.out.println("facultyName: " + this.facultyName);
        System.out.println("date: " + this.date);
        this.school.output();
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
class Student {
    private String studentName;
    private String studentClass;
    private double score;
    private Faculty faculty;

    public Student() {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.score = score;
        this.faculty = faculty;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.studentName = sc.nextLine();
        this.studentClass = sc.nextLine();
        this.score = sc.nextDouble();
        sc.nextLine();
        this.faculty.input();
    }

    public void display() {
        System.out.println("studentName: " + this.studentName);
        System.out.println("Class: " + this.studentClass);
        System.out.println("Score: " + this.score);
        this.faculty.output();
    }
}
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].input();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
    }
}
}
