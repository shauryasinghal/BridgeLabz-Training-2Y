package submission_of_Linear_and_Binary_Search;

public class FirstNegativeSearch {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 3, -2, 7, -8};

        int result = findFirstNegative(array);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found in the array");
        }
    }
}
