import java.util.*;

class WordFrequency {

    static void printFilteredWordFrequency(String feedback) {

        // Convert to lowercase
        feedback = feedback.toLowerCase();

        // Remove punctuation
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        // Split into words
        String[] words = feedback.split("\\s+");

        // Stop words
        String[] stopWords = {
            "the", "was", "and", "a", "is", "of", "in"
        };

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            boolean isStopWord = false;

            // Check whether word is a stop word
            for (int j = 0; j < stopWords.length; j++) {

                if (word.equals(stopWords[j])) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                }
                else {
                    map.put(word, 1);
                }
            }
        }

        // Convert map to list
        ArrayList<Map.Entry<String, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Sort by count in descending order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(
                Map.Entry<String, Integer> a,
                Map.Entry<String, Integer> b) {

                return b.getValue() - a.getValue();
            }
        });

        // Print result
        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        String feedback =
            "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}
