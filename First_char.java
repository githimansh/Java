public class First_char {

    public static void main(String[] args) {

        String name = "Java";


        char result = getFirstCharacter(name);
        char result1 = getLastCharacter(name);




        System.out.println("First Character = " + result);
        System.out.println("Last Character = " + result1);
        System.out.println(isEqual("Java", 'J'));
        isAlpha("JAVa");


        checkLength("Java");
    }

    public static char getFirstCharacter(String str) {
        return str.charAt(0);
    }

    public static char getLastCharacter(String a) {
        return a.charAt(a.length() - 1);
    }

    public static boolean isEqual(String b, char c) {
        return b.charAt(0) == c;
    }

    public static void isAlpha(String i) {

        char e = i.charAt(0);

        if (e >= 'A' && e <= 'Z') {
            System.out.println("First character is Uppercase");
        }
        else if (e >= 'a' && e <= 'z') {
            System.out.println("First character is Lowercase");
        }
        else {
            System.out.println("Any other character");
        }
    }
    public static void checkLength(String str1){
        if(str1.length() % 2 == 0){
            System.out.println("String length is even");
        }else {
            System.out.println("String length is odd");
        }
    }
}