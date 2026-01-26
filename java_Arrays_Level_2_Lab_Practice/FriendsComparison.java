package java_Arrays_Level_2_Lab_Practice;

import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = scanner.nextInt();

            System.out.print("Height (in cm): ");
            height[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n----- Results -----");
        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + " cm)");

        scanner.close();
    }
}