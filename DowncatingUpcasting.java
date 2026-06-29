 class A {
    void show(){
        System.out.println("class A");
    }
 }
 class B extends  A {
    void display(){
        System.out.println("class B");
    }
 }
public class DowncatingUpcasting {
    public static void main(String[] args) {
        A obj = new B(); // Upcasting

        obj.show();

        B b = (B) obj; // DownCasting

        b.show();
        b.display();



    }


}
