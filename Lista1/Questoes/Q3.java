import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        n2 = sc.nextInt();
        sc.close();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação:" + (n1 * n2));
        System.out.println("Quociente da Divisão:" + (n1 / n2));
        System.out.println("Resto da Divisão:" + (n1 % n2));


    }
}
