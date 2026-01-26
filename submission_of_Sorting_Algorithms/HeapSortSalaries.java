package submission_of_Sorting_Algorithms;

public class HeapSortSalaries {

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;      
        int left = 2 * i + 1; 
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            
        	int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {45000, 70000, 55000, 90000, 60000};

        System.out.println("Salary demands before sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }

        heapSort(salaryDemands);

        System.out.println("\n\nSalary demands after sorting (Ascending Order):");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
