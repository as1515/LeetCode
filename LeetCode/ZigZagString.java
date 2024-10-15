public class ZigZagString {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (Character c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigZagString zzString = new ZigZagString();
        System.out.println(zzString.convert("PAYPALISHIRING", 4));
    }
}

// (0,0)P (0,1) (0,2)A (0,3) (0,4)H (0,5) (0,6)N
// (1,0)A (1,1)P (1,2)L (1,3)S (1,4)I (1,5)I (1,6)G
// (2,0)Y (2,1) (2,2)I (2,3) (2,4)R (2,5) (2,6)