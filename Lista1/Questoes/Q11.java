import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        double conta1 = 100;
        double conta2 = 100;

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor a ser transferido: ");
        double valor = sc.nextDouble();
        if (valor > conta1) {
            System.out.println("Saldo insuficiente.");
        } else {
            conta1 -= valor;
            conta2 += valor;
            System.out.println("Saldo da conta 1: " + conta1);
            System.out.println("Saldo da conta 2: " + conta2);
        }
        sc.close();

    }
}