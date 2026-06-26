
class Task8{
 public static void character(String str){

   str = str.toLowerCase();
      String s = "aeiou";
     
    if(s.indexOf(str.charAt(0)) != -1){
       System.out.println("First character is a Vowel");
    }else{
        System.out.println("first character is not a vowel");
}
}
  public static void main(String[] args){
    character("Java");
    character("Apple");
     character("Himanshu");

} 
 }