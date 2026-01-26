package java_String_Level_3_Lab_Practice;

import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = current;
                index++;
            }
        }

        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("\nUnique Characters:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}