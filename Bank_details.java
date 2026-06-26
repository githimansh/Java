import java.util.Scanner;

class Bank {

    String customerName;
    long phoneNumber;
    int pin;
    double balance;

    Bank(String customerName, long phoneNumber, int pin, double balance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Customer name " + customerName);
        System.out.println("Phone Number " + phoneNumber);
        System.out.println("Balance " + balance);
    }
}



    public class Bank_details{
        public  static void deposit(Bank b , double deposit_amount, int enterPin){
            if(b.pin == enterPin){
                b.balance += deposit_amount;
                System.out.println("Deposit succesful");
                System.out.println("Update Balance is " + b.balance);
            }else {
                System.out.println("Invaild pin");
            }
        }
        public static void withdraw_amount(Bank b, double amount, int enterPin){
            if(amount <= b.balance && enterPin == b.pin){
                b.balance -= amount;
                System.out.println("Withdrawal succesful");
                System.out.println("updated balance " + b.balance);
            }else{
                System.out.println("insufficient balance");
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name ");
            String customername = sc.nextLine();

            System.out.println("Enter your phoneNumber");
            long phone = sc.nextLong();

            System.out.println("Set Pin");
            int pin = sc.nextInt();

            System.out.println("Enter initial Balance");
            double balance = sc.nextDouble();


            Bank b1 = new Bank(customername , phone, pin , balance );

            System.out.println("\n1. Despoit");
            System.out.println("2. Withdraw");
            System.out.println("Enter choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter pin");
                    int  dPin = sc.nextInt();

                    System.out.println("Enter Deposit amount");
                    double depositAmount = sc.nextDouble();

                    deposit(b1 , depositAmount, dPin);
                    break;

                case 2:
                    System.out.println("Enter pin");
                    int  wPin = sc.nextInt();

                    System.out.println("Enter Withdrawal amount");
                    double withdrawalAmount = sc.nextDouble();

                    withdraw_amount(b1 , withdrawalAmount, wPin);
                    break;

                default:
                    System.out.println("Invaild Amount");
            }
            b1.display();
        }
    }
