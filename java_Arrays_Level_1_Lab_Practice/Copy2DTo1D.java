package java_Arrays_Level_1_Lab_Practice;

public class Copy2DTo1D {
    public static void main(String[] args) {

        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = twoDArray.length;
        int cols = twoDArray[0].length;
        int totalElements = rows * cols;

        int[] oneDArray = new int[totalElements];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index] = twoDArray[i][j];
                index++;
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
    }
}
