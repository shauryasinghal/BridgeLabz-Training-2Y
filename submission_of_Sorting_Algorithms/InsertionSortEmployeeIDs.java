package submission_of_Sorting_Algorithms;

public class InsertionSortEmployeeIDs {

    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108};

        System.out.println("Employee IDs before sorting:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIDs);

        System.out.println("\n\nEmployee IDs after sorting (Ascending Order):");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}
