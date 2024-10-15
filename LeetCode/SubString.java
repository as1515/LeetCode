import java.util.HashSet;

public class SubString {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0, end = 0;

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else { // set contains s.charAt end
                set.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(set.toString());
        return maxLength;
    }

    public static void main(String[] args) throws Exception {
        SubString string = new SubString();
        int result = string.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
