import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        String frase;
        char pivo;
        Scanner sc = new Scanner(System.in);
        
        frase = sc.nextLine();
        char[] charArray = frase.toCharArray();
        int tamanhoFrase = frase.length();
        

        for (int i = 0; i < (tamanhoFrase/2); i++) {
            pivo = charArray[i];
            charArray[i] = frase.charAt(tamanhoFrase - i - 1);
            charArray[tamanhoFrase - i - 1] = pivo;
        }

        for (int i = 0; i < tamanhoFrase; i++) {
            System.out.print(charArray[i]);
        }
        sc.close();
    }
}
