package java_String_Level_3_Lab_Practice;

import java.util.Scanner;

public class CharacterFrequency {

    public static int[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = 0; 
            }
        }

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = ch;
                result[index][1] = freq[ch]; 
                index++;
                freq[ch] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println((char) frequencies[i][0] + " : " + frequencies[i][1]);
        }

        sc.close();
    }
}
