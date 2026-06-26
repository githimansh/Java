import java.util.Scanner;

class userInput{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Name");
                 String name = sc.nextLine();
          System.out.println("Enter the age");
                 int age = sc.nextInt();

        getName(name , age);


}

public static void getName(String name , int age){
     System.out.println("Name : " + name);
     System.out.println("Age : " + age);
}
}
 