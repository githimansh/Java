class Student {
    String name;
    int id;
    int age;

    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

public class Task10 {

    public static boolean charStudent(Student s) {

        char lastChar = Character.toLowerCase(
                s.name.charAt(s.name.length() - 1));

        String vowels = "aeiou";

        if (vowels.indexOf(lastChar) == -1) {
            return true; // consonant
        } else {
            return false; // vowel
        }
    }

    public static void main(String[] args) {

        Student s = new Student("Himanshu", 21, 23);

        System.out.println(charStudent(s));
    }
}