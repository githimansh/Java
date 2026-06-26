public class Task2 {

           public static void m1() {
        char ch = 'd';
        System.out.println(ch + 'A');
    }

 public static void m2() {
        Task2.m1();
    }



    public static void main(String[] args) {

        System.out.println("Main method");

        Task2.m3();

        System.out.println("Main method end");
    }
public static void m3() {
        char data = 'e';
        double i = data;
        String s = "java";

        System.out.println(i + data + s + i);

        m2();
    }


}