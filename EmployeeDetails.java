package ANP_D0453;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        String employeeAddress = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Salary: " + employeeSalary);
	}

}
