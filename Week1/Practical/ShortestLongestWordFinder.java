import java.util.Scanner;

public class ShortestLongestWordFinder {

    public static String[] findShortestAndLongestWord(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[] { "", "", "0", "0" };
        }

        String[] rawWords = text.split("[^a-zA-Z']+");
        String shortest = null;
        String longest = null;

        for (String word : rawWords) {
            if (word == null || word.trim().isEmpty()) {
                continue;
            }

            String normalized = word.replaceAll("^'+|'+$", "");
            if (normalized.isEmpty()) {
                continue;
            }

            if (shortest == null || normalized.length() < shortest.length()) {
                shortest = normalized;
            }
            if (longest == null || normalized.length() > longest.length()) {
                longest = normalized;
            }
        }

        if (shortest == null || longest == null) {
            return new String[] { "", "", "0", "0" };
        }

        return new String[] { shortest, longest, String.valueOf(shortest.length()), String.valueOf(longest.length()) };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or short paragraph: ");
        String text = scanner.nextLine();

        String[] result = findShortestAndLongestWord(text);
        String shortest = result[0];
        String longest = result[1];
        String shortestLength = result[2];
        String longestLength = result[3];

        if (shortest.isEmpty() || longest.isEmpty()) {
            System.out.println("No valid words found.");
        } else {
            System.out.println("Shortest: \"" + shortest + "\" (" + shortestLength + ") | " +
                    "Longest: \"" + longest + "\" (" + longestLength + ")");
        }

        scanner.close();
    }
}
