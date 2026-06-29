class Student1 {

    String name;
    int id;

    Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class CountVowel {

    public static int countVowels(Student1 s) {

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.name.length(); i++) {
            char ch = s.name.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1("Himanshu", 101);

        int totalVowels = countVowels(s1);

        System.out.println("Student Name : " + s1.name);
        System.out.println("Total Vowels : " + totalVowels);
    }
}
