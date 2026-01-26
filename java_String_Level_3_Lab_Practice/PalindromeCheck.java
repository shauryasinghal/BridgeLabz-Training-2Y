package java_String_Level_3_Lab_Practice;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}
