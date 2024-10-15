import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> intMap = new HashMap<Character, Integer>();
        intMap.put('I', 1);
        intMap.put('V', 5);
        intMap.put('X', 10);
        intMap.put('L', 50);
        intMap.put('C', 100);
        intMap.put('D', 500);
        intMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (Character c : s.toCharArray()) {

            int value = intMap.get(c);
            System.out.println("c " + c + " value " + value + " prevValue " + prevValue + " total " + total);
            if (prevValue < value) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        Roman2Integer r2i = new Roman2Integer();
        System.out.println(r2i.romanToInt("MCMXCIV"));

    }
}
