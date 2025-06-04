import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class student {
    private String name;
    private LocalDate dob;

    public student(String name, String dobString) {
        this.name = name;
        this.dob = parseDate(dobString);
    }

    private LocalDate parseDate(String dobString) {
        try {
            DateTimeFormatter formatter;
            if (dobString.matches("\\d{2}-\\d{2}-\\d{4}")) {
                formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            } else if (dobString.matches("\\d{4}-\\d{2}-\\d{2}")) {
                formatter = DateTimeFormatter.ISO_LOCAL_DATE;
            } else {
                throw new IllegalArgumentException("Invalid date format.");
            }
            return LocalDate.parse(dobString, formatter);
        } catch (Exception e) {
            throw new IllegalArgumentException("Date must be in DD-MM-YYYY or YYYY-MM-DD format.");
        }
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("\nStudent Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (S package program3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayPersonName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        LocalDate birthDate = parseDate(dob);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years");
    }

    private LocalDate parseDate(String dob) {
        DateTimeFormatter formatter;
        if (dob.matches("\\d{2}-\\d{2}-\\d{4}")) {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        } else if (dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        } else {
            throw new IllegalArgumentException("Invalid date format.");
        }
        return LocalDate.parse(dob, formatter);
    }
}

class Employee extends Person {
    private int empId;
    private double salary;

    public Employee (String name, int empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

public class person1 {
    public static void main(String[] args) {
        // Hardcoded input using constructors
        String name = "vaishnavi";
        String dob = "2005-05-04"; 
        int empId = 111;
        double salary = 55000.75;

        Employee emp = new Employee (name, empId, salary);
        emp.displayEmployeeDetails();
        emp.displayAge(dob);
    }
}
ystem.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Birth (DD-MM-YYYY or YYYY-MM-DD): ");
        String dob = sc.nextLine();

        student student = new student (name, dob);
        student.displayInfo();

        sc.close();
    }
}
