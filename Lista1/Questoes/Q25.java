import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int tamVetor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        tamVetor = sc.nextInt();

        int vetor[] = new int[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            vetor[i] = i + 1;
            System.out.println(vetor[i]);
        }
        sc.close();

    }
}
