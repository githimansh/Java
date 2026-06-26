class MethodsExample1{

public static void main(String[] args){
       MethodsExample1.isPrime(92);
} 


   public static void isPrime(int num){
        if(num <= 1){
        System.out.println(num + "is not Prime Number");
           return;
}

       boolean isPrime = true;
       for(int i = 2; i <=  num/2; i++){
         if(num % i == 0){
           isPrime = false;
           break;
} 
}
   if(isPrime){
   System.out.println(num + "is Prime Number");
     }else{
      System.out.println(num + " is not Prime Number");
}
           

}
}