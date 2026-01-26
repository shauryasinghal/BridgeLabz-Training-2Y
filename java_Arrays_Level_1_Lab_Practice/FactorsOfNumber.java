package java_Arrays_Level_1_Lab_Practice;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}