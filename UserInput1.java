import java.util.Scanner;

class UserInput1{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number");
       int num = sc.nextInt();
         cube(num);

    }
   public static void cube(int a){
      System.out.println("cube is" + (a*a*a));
}
}