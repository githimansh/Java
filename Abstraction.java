abstract class Vehicle{
   abstract void start();

void fuel(){
  System.out.println("Vehicle uses fuel");
}
}
class car extends Vehicle {
@Override  
  void start(){
  System.out.println("car starts with key");
}
}

public class Abstraction{
   public static void main(String[] args){
   Vehicle v = new car();

v.start();
v.fuel();

}
}
