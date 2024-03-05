//consertar o output.

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num == 1 || num == 2) {
            System.out.println("É primo.");
        } else {

            for (int i = 2; i < num; i++) {
                
                if (num % i == 0) {
                    System.out.println("Não é primo.");
                } else {
                    System.out.println("É primo.");
                }
            }
        }
        sc.close();
    }
}
