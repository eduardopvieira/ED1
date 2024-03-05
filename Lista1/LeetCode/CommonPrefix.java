public class CommonPrefix {
    public static void main(String[] args) {
        String[] palavras = {"flowers", "flow", "flight"};
        System.out.println(longestCommonPrefix(palavras));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        String prefixo = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefixo) != 0) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                if (prefixo.isEmpty()) {
                    return "";
                }
            }
        }


        return prefixo;
    }
}
