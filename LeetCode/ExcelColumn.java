public class ExcelColumn {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnString = new StringBuilder();

        while (columnNumber > 0) {
            int charNumber = (columnNumber - 1) % 26;
            char c = (char) ('A' + charNumber);
            columnString.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }
        return columnString.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        ExcelColumn columnNumber = new ExcelColumn();
        System.out.println(columnNumber.convertToTitle(26));
        System.out.println(columnNumber.convertToTitle(27));
        System.out.println(columnNumber.convertToTitle(52));
        System.out.println(columnNumber.convertToTitle(701));
        System.out.println(columnNumber.convertToTitle(702));
        System.out.println(columnNumber.convertToTitle(703));
    }
}
