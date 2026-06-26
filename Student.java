class Student {
  String name;
   int age;

public static void main(String[] args){

 Student s1 = new Student();
 

 Student s2 = new Student();


 Student s3 = new Student();

Student s4 = s1;
Student s5 = s3;

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
}
}
 