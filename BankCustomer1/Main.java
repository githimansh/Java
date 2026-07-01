package BankCustomer1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Details of Customer " + i);

//            BankCustomer customer = new BankCustomer(); // One object at a time
            BankCustomer customer = new BankCustomer();
            customer.getDetails(sc);


            System.out.println("\nCustomer Details");
            System.out.println(customer); // Automatically calls toString()
            System.out.println("----------------------------");
        }

        sc.close();
    }
}