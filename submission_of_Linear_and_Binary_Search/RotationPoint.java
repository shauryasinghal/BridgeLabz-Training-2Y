package submission_of_Linear_and_Binary_Search;

public class RotationPoint {

    public static int findRotationPoint(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
               
                low = mid + 1;
            } else {
               
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};

        int index = findRotationPoint(arr);

        System.out.println("Index of smallest element: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}
