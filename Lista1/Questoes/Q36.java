import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        System.out.println("Qual o numero para calcular o fatorial? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("O fatorial de " + num + " é " + fatorialRecursivo(num));

    }

    public static int fatorialRecursivo(int n) {
        if (n == 1) {
            return 1;
        }

        return (n * fatorialRecursivo(n-1)); 
    }

}
