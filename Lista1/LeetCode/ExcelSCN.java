class ExcelSCN {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        char c;
        for (int i = 0; i < columnTitle.length(); i++) {
        c = columnTitle.charAt(i);
        result = result * 26;
        result += (c - 'A' + 1);
        }
        return result;
    }
}