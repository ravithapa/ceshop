package project.project2;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString().trim()) ? true : false;
    }
}