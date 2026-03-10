import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Method to create and return the map of character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // Method to print banner word
    public static void printBanner(String word, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patterns = buildCharacterPatterns();

        // Banner message
        String message = "OOPS";

        // Print banner
        printBanner(message, patterns);
    }
}
