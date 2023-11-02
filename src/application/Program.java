package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Enter employee name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Enter tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: "+ employee);



    }
}
