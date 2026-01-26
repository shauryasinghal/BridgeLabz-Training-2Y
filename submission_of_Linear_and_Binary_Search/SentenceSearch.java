package submission_of_Linear_and_Binary_Search;

public class SentenceSearch {

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; 
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful programming language",
            "Linear search is easy to understand",
            "Data structures are important",
            "Practice makes perfect"
        };

        String word = "search";

        String result = findSentenceWithWord(sentences, word);

        System.out.println(result);
    }
}
