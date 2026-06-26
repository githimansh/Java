import java.util.*;
class Employee {
    int id;
    String name;
    int age;
Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
public String toString() {
        return name;
    }
}

public class Main8 {
public static void main(String[] args) {

 List<Employee> employees = Arrays.asList(
                new Employee(101, "Rahul", 25),
                new Employee(102, "Amit", 30),
                new Employee(103, "Priya", 25),
                new Employee(104, "Neha", 28),
                new Employee(105, "Rohan", 30)
        );
  Map<Integer, List<Employee>> result =
    employees.stream().collect(Collectors.groupingBy(emp -> emp.age));
System.out.println(result);
    }
}