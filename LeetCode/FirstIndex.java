public class FirstIndex {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); easier optimized implementation

        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        FirstIndex str = new FirstIndex();
        System.out.println(str.strStr("butsad", "sad"));
    }

}
