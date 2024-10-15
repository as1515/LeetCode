import java.util.HashMap;
import java.util.Stack;

public class ValidParetheses {

    public boolean isValid(String s) {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParetheses validity = new ValidParetheses();
        System.out.println(validity.isValid("{()}"));
        System.out.println(validity.isValid("()[]{}"));
        System.out.println(validity.isValid("(]{}"));
        System.out.println(validity.isValid("(]H90"));

    }
}
// "^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$"

// Trial 1
// if (s.matches(".*[0-9].*") || s.matches(".*[A-Z].*") || s == "") {
// return false;
// }

// char oR = '(';
// char cR = ')';
// char oC = '{';
// char cC = '}';
// char oS = '[';
// char cS = ']';
// boolean prev = false;
// for (int i = 0; i < s.length(); i++) {
// if (i % 2 == 0) {
// if (s.charAt(i) == oR && s.charAt(i + 1) == cR || s.charAt(i) == oC &&
// s.charAt(i + 1) == cC
// || s.charAt(i) == oS && s.charAt(i + 1) == cS || prev) {
// prev = true;
// return true;
// } else {
// return false;
// }
// }
// }
// return false;