import java.util.Scanner;

// Base class
class Person {
    String sName;
    int age;

    // Method to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        sName = scanner.nextLine();
        System.out.print("Enter the age: ");
        age = scanner.nextInt();
        scanner.nextLine(); 
    }
}

// Derived class
class Student extends Person {
    String studentId;
    String studentCourse;
    int numberOfUnits;
    int feePerUnit = 1000;
    double totalFee;

    @Override
    public void getInput() {
        super.getInput(); // Call the getInput method of Person
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID: ");
        studentId = scanner.nextLine();
        System.out.print("Enrolled Program: ");
        studentCourse = scanner.nextLine();
        System.out.print("Number of Units: ");
        numberOfUnits = scanner.nextInt();
        scanner.nextLine(); 
    }

    public double calculateFees() {
        return totalFee = numberOfUnits * feePerUnit;
    }
}

class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    @Override
    public void getInput() {
        super.getInput(); // Call the getInput method of Person
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee ID: ");
        employeeID = scanner.nextLine();
        System.out.print("Department: ");
        department = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Instructor instructor = new Instructor();

        student.getInput();
        instructor.getInput();

        System.out.println("Student Details:");
        System.out.println("Name: " + student.sName);
        System.out.println("Age: " + student.age);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Enrolled Program: " + student.studentCourse);
        System.out.println("Total Fees: " + student.calculateFees());

        System.out.println("\nInstructor Details:");
        System.out.println("Name: " + instructor.sName);
        System.out.println("Age: " + instructor.age);
        System.out.println("Employee ID: " + instructor.employeeID);
        System.out.println("Department: " + instructor.department);
        System.out.println("Salary: " + instructor.salary);
    }
}