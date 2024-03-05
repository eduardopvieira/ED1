class Solution {
    public boolean isPalindrome(String s) {
        String fraseLimpa = removerAcentuacoes(s).toLowerCase();
        char[] arrayCarac = fraseLimpa.toCharArray();
        int tamanhoFrase = fraseLimpa.length();

        for (int i = 0; i < (tamanhoFrase/2); i++) {
            if (arrayCarac[i] != arrayCarac[tamanhoFrase-1-i]) {
                return false;
            }
        }
        return true;
    }

    public String removerAcentuacoes(String s) {
        StringBuilder retorno = new StringBuilder();
        for (char caractere : s.toCharArray()) {
            if (Character.isLetterOrDigit(caractere)) {
                retorno.append(caractere);
            }
        }
        
        return retorno.toString();
    }
}