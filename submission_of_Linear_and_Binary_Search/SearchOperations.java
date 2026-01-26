package submission_of_Linear_and_Binary_Search;

import java.util.Arrays;

public class SearchOperations {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        for (int i = 1; i <= n + 1; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        Arrays.sort(arr);
        int target = 4;

        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}