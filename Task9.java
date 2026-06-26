//Design a method which takes one String and one Character arguments , now return  true if the given character is present in given String other return  fasle 
 class Task9{
    public static boolean character(String str, char ch){
     return str.indexOf(ch) != -1;
 }
  public static void main(String[] args){
     System.out.println(character("Java", 'J'));
     System.out.println(character("java" , 'z'));
}
}