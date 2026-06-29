import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        String result = "";

        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch +32);
            }
            result = result + ch;
        }
        System.out.println("LowerCase String : " + result);
    }
}
