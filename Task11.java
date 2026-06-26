class Task11{

    public static boolean isPalindrome(String str, int start, int end) {
 while (start < end) {
 if (str.charAt(start) != str.charAt(end)) {
  return false;
  }
 start++;
 end--;
  }
 return true;
    }

    public static String longestPalindrome(String str) {

 int maxLength = 0;
int startIndex = 0;

for (int i = 0; i < str.length(); i++) {

for (int j = i; j < str.length(); j++) {

  if (isPalindrome(str, i, j)) {

    int length = j - i + 1;

   if (length > maxLength) {
    maxLength = length;
  startIndex = i;
         }
      }
            }
        }

 String result = "";

        for (int i = startIndex; i < startIndex + maxLength; i++) {
            result += str.charAt(i);
        }

   return result;
    }

    public static void main(String[] args) {

  String str = "babad";

 System.out.println("Longest Palindrome: "  + longestPalindrome(str));
    }
}