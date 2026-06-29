class Animal1{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal1{
    void bark(){
        System.out.println("Cat Sound");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Animal1 obj = new Cat(); // Upcating

        Cat c = (Cat) obj; // DownCasting

        c.sound();
        c.bark();


        /* Animal1 obj = new ANimal1();
        Cat c = (Cat)obj;
        this is runtime error
                */
    }
}
