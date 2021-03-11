package evaluare1;

import java.util.Date;
import java.util.Scanner;

public class Student {
    String name;
    int age, enrollmentNumber;
    double[] avgMarks = new double[2];

    Student(String name, int age, int enrollmentNumber, double[] avgMarks) {
        this.name = name;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
        this.avgMarks = avgMarks;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAvgMarks(double[] avgMarks) {
        this.avgMarks = avgMarks;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getAvgMarks() {
        return this.avgMarks;
    }

    public int getAge() {
        return this.age;
    }

    public int getEnrollmentNumber() {
        return this.enrollmentNumber;
    }

    public String getName() {
        return this.name;
    }

    public boolean isScholarship() {
        return (avgMarks[0] >= 7) && (avgMarks[1] >= 7);
    }

    public void sayHello() {
        Date currentDate = new Date();
        int currentHour = currentDate.getHours();

        if (currentHour >= 5 && currentHour <= 11) {
            System.out.println("Buna dimineata");
        } else if (currentHour >= 12 && currentHour <= 15) {
            System.out.println("Buna ziua");
        } else if (currentHour >= 16 && currentHour <= 21) {
            System.out.println("Buna seara");
        } else {
            System.out.println("Noapte buna");
        }
    }
}

class Students {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents = read.nextInt();
        Student[] studentsList = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double[] avgMarks = new double[2];
            System.out.println("Enter the name");
            String name = read.next();
            System.out.println("Enter the age");
            int age = read.nextInt();
            System.out.println("Enter the enrollment number");
            int enrollmentNumber = read.nextInt();
            System.out.println("Enter first average number");
            avgMarks[0] = read.nextDouble();
            System.out.println("Enter second average number");
            avgMarks[1] = read.nextDouble();

            studentsList[i] = new Student(name, age, enrollmentNumber, avgMarks);
        }

        for (Student student : studentsList) {
            if (student.isScholarship()) {
                System.out.println("-----------------------");
                System.out.println(student.getName());
                student.sayHello();
                System.out.println("-----------------------");
            }
        }
    }
}