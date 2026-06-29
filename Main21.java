class Animal{
    void sound(){
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends  Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Main21 {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting

        obj.sound();

        //obj.bark(); this is compile time error

    }
}
