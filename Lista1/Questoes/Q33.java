import java.util.Scanner;
public class Q33 {
    
    public static void main(String[] args) {      
        String palavra;
        char[] arrayPalavra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Palavra: ");
        palavra = sc.nextLine();
        sc.close();

        arrayPalavra = palavra.toCharArray();
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho; i++) {
            
            int contador = 0;
            char pivo = arrayPalavra[i];

            if (pivo == 0) {
                continue;
            }
            
            for (int j = 0; j < tamanho; j++) {
            
                if (pivo == arrayPalavra[j]) {
                    contador++;
                    arrayPalavra[j] = 0;
                }
            }
            System.out.println(pivo + ": " + contador);
        }
    }
}
