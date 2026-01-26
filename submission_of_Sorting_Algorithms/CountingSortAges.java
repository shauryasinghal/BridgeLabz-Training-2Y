package submission_of_Sorting_Algorithms;

public class CountingSortAges {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int[] count = new int[maxAge - minAge + 1];

        for (int age : ages) {
            count[age - minAge]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {15, 12, 18, 10, 14, 16, 12, 11};

        System.out.println("Ages before sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }

        countingSort(studentAges);

        System.out.println("\n\nAges after sorting (Ascending Order):");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
