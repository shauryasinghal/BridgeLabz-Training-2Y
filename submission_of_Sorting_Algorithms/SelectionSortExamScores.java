package submission_of_Sorting_Algorithms;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {72, 88, 65, 90, 79};

        System.out.println("Exam scores before sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }

        selectionSort(examScores);

        System.out.println("\n\nExam scores after sorting (Ascending Order):");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
