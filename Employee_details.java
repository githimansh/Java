class Employee_details{

 //Instance Variables
  String name = "Himanshu" ;
   int age = 23;

//Static variables 
static String company = "Tcs";

void show(){
  //local variable 
double salary = 50000;

System.out.println("Name : " + name);
System.out.println("Age : " + age);
System.out.println("Company : " + company);
System.out.println("Salary : " + salary);

}

public static void main(String[] args){

Employee_details e1 = new Employee_details();

e1.show();
}
}
