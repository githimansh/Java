import java.util.Scanner;

class Employee2{
    private String name;
    private int id;
    private double salary;

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
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

}

public class Employee_Entity1 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();

        emp.setName("Himanshu");
        emp.setId(21);
        emp.setSalary(456.25);

        System.out.println("Name : " + emp.getName());
        System.out.println("ID : " + emp.getId());
        System.out.println("Salary : " + emp.getSalary());

        System.out.println("---------------");
        System.out.println("Input from the user");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        emp.setName(sc.nextLine());

        System.out.println("Name " + emp.getName());
    }
}
