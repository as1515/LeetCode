public class LongPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String longCommon = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(longCommon)) {
                longCommon = longCommon.substring(0, longCommon.length() - 1);
                if (longCommon.isEmpty()) {
                    return "";
                }
            }
        }
        return longCommon;
    }

    public static void main(String[] args) {
        LongPrefix prefix = new LongPrefix();
        String[] strs = { "", "" };
        System.out.println(prefix.longestCommonPrefix(strs));
    }
}
