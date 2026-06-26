public class Main3 {

    public static void main(String[] args) {

        System.out.println(isCharacter('B'));

        int result = smallest(5, 7);
        System.out.println("Smallest Number = " + result);

        checkInterviewReady(1);
        Task4('*');


    }

    public static boolean isCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static int smallest(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void checkInterviewReady(int mockRating) {

        if (mockRating == 1) {
            System.out.println("Student is Ready for Interview");
        } else if (mockRating >= 2) {
            System.out.println("Student needs to work again");
        } else {
            System.out.println("Invalid Mock Rating");
        }
    }
    public static void Task4(char mockRating1){
        if(mockRating1 == '*' || mockRating1 == '1'){
            System.out.println("direct Interview");
        }else if (mockRating1 == '2'){
            System.out.println("Need to attend Grooming then apply for the interview");
        }else{
            System.out.println("attend classes and Again . No interview Right Now");
        }
    }
}
