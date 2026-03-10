public class vardhan {


    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public char getCharacter() {
            return character;
        }

    
        public String[] getPattern() {
            return pattern;
        }
    }

    
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == ch) {
                return p.getPattern();
            }
        }
        return null;
    }

    
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(patterns, ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

       
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        
        printBanner("OOPS", patterns);
    }
}
