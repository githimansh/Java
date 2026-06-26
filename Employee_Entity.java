import java.util.Scanner;

class Employee1{
    private String name;
    private int id;
    private double salary;
    private String email;
    private long phoneNumber;


    public void setName(String name ){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public String getEmail(){
        return email;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

 }

public class Employee_Entity {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();

        emp.setName("Himanshu Kumar");
        emp.setId(101);
        emp.setSalary(50000);
        emp.setEmail("himanshu@gmail.com");
        emp.setPhoneNumber(9876543210L);

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name         : " + emp.getName());
        System.out.println("ID           : " + emp.getId());
        System.out.println("Salary       : " + emp.getSalary());
        System.out.println("Email        : " + emp.getEmail());
        System.out.println("Phone Number : " + emp.getPhoneNumber());

        System.out.println("----------------------");
        System.out.println("Input from User");

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        Employee1 emp1 = new Employee1();

        System.out.print("Enter Name: ");
        emp1.setName(sc.nextLine());

        System.out.print("Enter ID: ");
        emp1.setId(sc.nextInt());

        System.out.print("Enter Salary: ");
        emp1.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Email: ");
        emp1.setEmail(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        emp1.setPhoneNumber(sc.nextLong());

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getId());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Email: " + emp1.getEmail());
        System.out.println("Phone Number: " + emp1.getPhoneNumber());


    }
}
