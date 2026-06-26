//design a real world entity having College and intizilies all the states by using parmatersied constructor 

class College {
 String studentName;
 int id;
 int age;
int rollNo;
double fee;

    
         public College(String studentName, int id, int age, int rollNo, double fee) {
  this.studentName = studentName;
 this.id = id;
 this.age = age;
this.rollNo = rollNo;
this.fee = fee;
    }
public void display() {
  System.out.println("Student Name : " + studentName);
  System.out.println("ID           : " + id);
  System.out.println("Age          : " + age);
 System.out.println("Roll No      : " + rollNo);
 System.out.println("Fee          : " + fee);
    }
}

public class Main15 {
    public static void main(String[] args) {

   College c1 = new College("Himanshu", 101, 21, 5001, 45000.0);
    College c2 = new College("Rahul", 102, 22, 5002, 50000.0);

        c1.display();
        System.out.println("----------------");
        c2.display();
    }
}