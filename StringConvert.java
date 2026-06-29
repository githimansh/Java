public class StringConvert {

    public static String convert(String str) {

        String result = "";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (vowels.indexOf(ch) != -1) {
                    result = result + Character.toUpperCase(ch);
                } else {
                    result = result + Character.toLowerCase(ch);
                }

            } else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "Hello Aniket";

        System.out.println(convert(str));
    }
}