/*Implement a business logic interface. Create an interface Bonus with method:
 double calculateBonus(double salary)
Implement two classes:
 Manager: bonus is 20% of salary
 Developer: bonus is 10% of salary
Ask for employee name, type, and salary. Display calculated bonus.*/

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Manager
        System.out.print("Enter Manager Name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter Manager Type: ");
        String managerType = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        sc.nextLine(); // Clear buffer

        // Input for Developer
        System.out.print("\nEnter Developer Name: ");
        String developerName = sc.nextLine();
        System.out.print("Enter Developer Type: ");
        String developerType = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double developerSalary = sc.nextDouble();

        // Create Manager and Developer objects
        Manager m1 = new Manager(managerName, managerType, managerSalary);
        Developer d1 = new Developer(developerName, developerType, developerSalary);

        // Output for Manager
        m1.displayInfo();
        System.out.println("Bonus : $" + m1.calculateBonus(m1.salary));

        System.out.println(); // Blank line
        System.out.println("............."); // Dotted line
        System.out.println(); // Blank line

        // Output for Developer
        d1.displayInfo();
        System.out.println("Bonus : $" + d1.calculateBonus(d1.salary));

        sc.close(); // Close the scanner
    }
}

interface Bonus {
    double calculateBonus(double salary);
}

class Manager implements Bonus {
    String name;
    String type;
    double salary;

    Manager(String n, String t, double s) {
        name = n;
        type = t;
        salary = s;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.2;
    }

    void displayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("Type : " + type);
        System.out.println("Salary : $" + salary);
    }
}

class Developer implements Bonus {
    String name;
    String type;
    double salary;

    Developer(String n, String t, double s) {
        name = n;
        type = t;
        salary = s;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.1;
    }

    void displayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("Type : " + type);
        System.out.println("Salary : $" + salary);
    }
}
