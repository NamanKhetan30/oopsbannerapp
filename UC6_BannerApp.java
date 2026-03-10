public class UC6_BannerApp {

    // Function for letter O
    public static String O(int row) {
        String[] o = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return o[row];
    }

    // Function for letter P
    public static String P(int row) {
        String[] p = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
        return p[row];
    }

    // Function for letter S
    public static String S(int row) {
        String[] s = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
        return s[row];
    }

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    O(i), P(i), S(i), S(i)
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}