package java_Arrays_Level_2_Lab_Practice;

import java.util.Scanner;

public class BMIMultiDimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0)
                    System.out.println("Weight must be positive. Re-enter.");
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0)
                    System.out.println("Height must be positive. Re-enter.");
            } while (personData[i][1] <= 0);
        }

        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI DETAILS");
        System.out.println("-------------------------------------------------");
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t\t%s\n",
                    personData[i][1],     
                    personData[i][0],     
                    personData[i][2],     
                    weightStatus[i]);     
        }

        sc.close();
    }
}