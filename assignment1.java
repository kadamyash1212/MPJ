import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private int marks[] = new int[5];
    private double per;
    private char grade;

    Student(String n, int r, int m[]) {
        name = n;
        roll = r;
        marks = m;
    }

    public void calculate() {
        int total = 0;
        for (int i = 0; i < 5; i++)
            total += marks[i];

        per = total / 5.0;

        if (per >= 75)
            grade = 'A';
        else if (per >= 50)
            grade = 'B';
        else
            grade = 'C';
    }

    public void display() {
        System.out.println(name + "  Roll: " + roll + "  Percentage: " + per + "  Grade: " + grade);
    }
}

public class StudentMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Name, Roll No and 5 Marks:");
            String name = sc.next();
            int roll = sc.nextInt();

            int m[] = new int[5];
            for (int j = 0; j < 5; j++)
                m[j] = sc.nextInt();

            s[i] = new Student(name, roll, m);
            s[i].calculate();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < 3; i++)
            s[i].display();
        sc.close();
    }
}