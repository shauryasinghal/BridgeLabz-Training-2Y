package submission_of_Sorting_Algorithms;

public class BubbleSortMarks {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 89, 62, 90, 55};

        System.out.println("Marks before sorting:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        bubbleSort(studentMarks);

        System.out.println("\n\nMarks after sorting (Ascending Order):");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
