//copy the data of the student s1 into student s2 

 class Student{
  String name;
int id;
int age;
 double fee;

 public Student(String name, int id, int age, double fee){
  this.name = name;
this.id = id;
this.age = age;
this.fee =fee;
}

}

 public class CopyOfStudent{
    public static void main(String[] args){
    Student s1 = new Student("Himanshu", 101, 22, 5670.5);
Student s2 = new Student("", 0 , 0 , 0.0);

   s2.name = s1.name;
    s2.id = s1.id;
    s2.age = s1.age;
    s2.fee = s1.fee;

System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.age);
}
}