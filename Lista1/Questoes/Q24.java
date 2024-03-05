import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        int operacao;
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha uma operaçao:\n1 - Potenciação\n2 - Raiz Quadrada\n3 - Fatorial\n0 - Sair");
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Escolha o primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Escolha o segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.println("A potencia de " + num1 + " elevado a " + num2 + " = " + Math.pow(num1, num2));
                    break;
                case 2:
                    System.out.println("Escolha o primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.println("A raiz de " + num1 + " é " + Math.sqrt(num1));
                    break;
                case 3:
                    System.out.println("Escolha o primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.println(" O fatorial de " + num1 + " é " + fatorial(num1));
                    break;
            }
        } while(operacao != 0);
        sc.close();

    }
    static int fatorial(int n) {
        int valorFat = 1;
        
        if (n == 1 || n == 0) {
            return 1;
        }
        
        for (int i = 1; i <= n; i++) {
                valorFat = valorFat * i; 
        }
        return valorFat;
    }
}
