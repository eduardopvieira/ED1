import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int linhas, colunas, contador = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas terá a matriz? ");
        linhas = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz? ");
        colunas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println(contador);
                contador++;
            }
        }
        sc.close();
    }
}
