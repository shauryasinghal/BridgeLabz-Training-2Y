package java_Arrays_Level_1_Lab_Practice;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        while (count < 10) {
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            arr[count] = num;
            sum += num;
            count++;
        }

        System.out.println("\nStored Numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nSum of all numbers: " + sum);

        sc.close();
    }
}