public class LastWordLength {
    public int lastWordLength(String s) {
        s = s.trim();
        String[] split = s.split(" ");

        return split[split.length - 1].length();
    }

    public static void main(String[] args) throws Exception {
        LastWordLength lastWord = new LastWordLength();
        System.out.println(lastWord.lastWordLength("The wheels on the bus go round and round"));

    }
}
