package BankCustomer1;

import java.util.Scanner;

public class BankCustomer {

    private String customerName;
    private int bankId;
    private double balance;

    public void getDetails(Scanner sc) {

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Bank Id: ");
        bankId = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine(); // Consume newline
    }

    @Override
    public String toString() {
        return "Customer Name : " + customerName +
                "\nBank Id       : " + bankId +
                "\nBalance       : " + balance;
    }
}