class Employee {
private String name;
 private int salary;


public void setName(String name){
      this.name = name;
}

public void setSalary(int salary){
  this.salary = salary;
}

public String getName(){
  return name;
}

public int getSalary(){
return salary;
}
}

public class Encapsulation{
public static void main(String[] args){
  Employee emp = new Employee();

emp.setName("Himanshu");
emp.setSalary(50000);

System.out.println("Name : " +  emp.getName());

System.out.println("Salary : " + emp.getSalary());
}
}