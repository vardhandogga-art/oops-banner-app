public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
            String.join(" ", " *** ", " *** ", " *** ", " *** "), // Line 0
            String.join(" ", "* *", "* *", "* *", "* "), // Line 1
            String.join(" ", "* *", "* *", "* *", "* "), // Line 2
            String.join(" ", "* *", "* *", "* *", " *** "), // Line 3
            String.join(" ", "* *", "* *", "* *", "    *"), // Line 4
            String.join(" ", "* *", "* *", "* *", "    *"), // Line 5
            String.join(" ", " *** ", " *** ", " *** ", " *** ")  // Line 6
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
