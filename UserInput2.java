import java.util.Scanner;

class UserInput2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
   System.out.println("enter the Salary");
     double salary = sc.nextDouble();


System.out.println("Enter the increment percentage");
   double inc_Salary = sc.nextDouble();
 
  double updatedSalary = salary(salary, inc_Salary);
  System.out.println("  updated Salary is " + updatedSalary);
   

   
}
  public static double salary(double a, double b){
        double increment = (a * b)/100;
   return  a + increment;
      
}
}