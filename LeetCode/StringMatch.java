public class StringMatch {
    public boolean isMatch(String s, String p) {
        boolean[][] grid = new boolean[s.length() + 1][p.length() + 1];
        grid[0][0] = true;

        for (int j = 1; j < p.length() + 1; j++) {
            if (p.charAt(j - 1) == '*' && grid[0][j - 2]) {
                grid[0][j] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if ((p.charAt(j) == s.charAt(i)) || (p.charAt(j) == '.')) {
                    grid[i + 1][j + 1] = grid[i][j];
                } else if (p.charAt(j) == '*' && j > 0) {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        grid[i + 1][j + 1] = grid[i + 1][j - 1];
                    } else {
                        grid[i + 1][j + 1] = grid[i + 1][j] || grid[i][j + 1] || grid[i + 1][j - 1];
                    }
                }
            }
        }

        return grid[s.length()][p.length()];
    }

    public static void main(String[] args) {
        StringMatch pattern = new StringMatch();
        System.out.println("aa: " + "a " + pattern.isMatch("aa", "a") + " expected false");
        System.out.println("aa: " + "a* " + pattern.isMatch("aa", "a*") + " expected true");
        System.out.println(": " + "a*b* " + pattern.isMatch(" ", "a*b*") + " expected true");

    }
}
