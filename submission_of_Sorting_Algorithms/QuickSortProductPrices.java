package submission_of_Sorting_Algorithms;

public class QuickSortProductPrices {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] productPrices = {1200, 450, 999, 299, 1500, 799};

        System.out.println("Product prices before sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\n\nProduct prices after sorting (Ascending Order):");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
