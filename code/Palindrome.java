public class Palindrome {

  public static boolean checkPalindrome(String s, int begin, int end) {
    if (s.charAt(begin) != s.charAt(end) ) {
      return false;
    } else if (begin >= end) {
      return true;
    } else {
      return checkPalindrome(s, begin + 1, end - 1);
    }
  }

  public static void main(String[] args) {
    String s = args[0];
    if (checkPalindrome(s, 0, s.length() - 1)) {
      System.out.println(s + " is a palindrome");
    } else {
      System.out.println(s + " is not a palindrome");
    }
  }
}