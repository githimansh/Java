class Employee5{
    private String name;
    private int id;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Employee_Salary {

   public static Employee5 getHighestPaidEmployee(Employee5 e1, Employee5 e2, Employee5 e3){
        Employee5 highestPaid = e1;
         if(e2.getSalary() > highestPaid.getSalary()){
             highestPaid = e2;
         }
         if(e3.getSalary() > highestPaid.getSalary()){
             highestPaid = e3;
         }
         return highestPaid;
    }

    public static void main(String[] args) {
        Employee5 e1 = new  Employee5();
        e1.setName("Himanshu");
        e1.setId(21);
        e1.setAge(40);
        e1.setSalary(450.25);

        Employee5 e2 = new Employee5();
        e2.setName("Aman");
        e2.setId(22);
        e2.setAge(42);
        e2.setSalary(5236.025);

        Employee5 e3 = new Employee5();
        e3.setName("Ram");
        e3.setId(23);
        e3.setAge(38);
        e3.setSalary(200.32);

        Employee5 highestPaid = getHighestPaidEmployee(e1, e2, e3);
        System.out.println("Highest Paid Employee Details");
        System.out.println("------------------");
        System.out.println("Name  :" + highestPaid.getName());
        System.out.println("ID    :" + highestPaid.getId());
        System.out.println("Age   :" + highestPaid.getAge());
        System.out.println("Salary :" + highestPaid.getSalary());

    }
}
