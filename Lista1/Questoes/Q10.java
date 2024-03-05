import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int n1;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        sc.close();

    }
}
