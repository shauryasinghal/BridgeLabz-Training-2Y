package java_Arrays_Level_1_Lab_Practice;

import java.util.Scanner;

public class Number_Checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < 5; i++) {
            int num = arr[i];

            if (num > 0) {
                System.out.print(num + " is Positive");
                if (num % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        System.out.println("\nComparison of first and last elements:");
        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
	}
}