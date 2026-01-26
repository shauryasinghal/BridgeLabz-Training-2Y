package java_Arrays_Level_1_Lab_Practice;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("\nMean height of the football team: " + mean);

        sc.close();
    }
}
