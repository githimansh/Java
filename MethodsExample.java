class MethodsExample{
public static void main(String[] args){
  MethodsExample.addition(10, 30);
  MethodsExample.isEvenNumber(10);

  MethodsExample.lastDigit(5567);

  MethodsExample.votingVerfication(22);

MethodsExample.isPrime(91);

}


public static void addition(int a , int b){

System.out.println("addition methods");
int sum = a + b;
System.out.println(a + " + " + b + " = " + sum);

}
public static void isEvenNumber(int num){
  int rem = num % 2;

  if (rem == 0){
    System.out.println("Yes " + num +  "  is Even Number");
}else{
     System.out.println("No " + num + " is odd number");
}
}
static void lastDigit(int num) {
        int rem = num % 10;

        if (rem == 7) {
            System.out.println("Yes, last digit is 7");
        } else {
            System.out.println("No, last digit is not 7");
        }
    }


  public static void votingVerfication(int age){
   if( age >= 18){
System.out.println("Eligible for the voting");
}else{
  System.out.println("Not Eligible for the voting");
}
}
  public static void isPrime(int num1){
             if (num1 <= 1) {
      System.out.println(num1 + " is not a Prime Number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= num1 / 2; i++) {

            if (num1 % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num1 + " is a Prime Number");
        } else {
            System.out.println(num1 + " is not a Prime Number");
        }
    }

  
}
