import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        sc.close();
        int pivoFor1 = num1, pivoFor2 = num2;
        int pivoDoWhile1 = num1, pivoDoWhile2 = num2;
        int pivoWhile1 = num1, pivoWhile2 = num2;

//===================================USANDO WHILE====================================
        
        if (pivoWhile1%2 == 0) {
            pivoWhile1++;
        }

        while (pivoWhile1 <= pivoWhile2) {
                System.out.println("Usando while: " + pivoWhile1);
                pivoWhile1+=2;
            }

            System.out.println("");

//===================================USANDO DO WHILE====================================
        
        if (pivoDoWhile1%2 == 0) {
            pivoDoWhile1++;
        }
        do {
            System.out.println("Usando do while: " + pivoDoWhile1);
            pivoDoWhile1+=2;
        } while (pivoDoWhile1 <= pivoDoWhile2);

        System.out.println("");

//===================================USANDO FOR====================================
        if (pivoFor1%2 == 0) {
            pivoFor1++;
        }        
        for (int i = pivoFor1; i <= pivoFor2; i+=2) {
            System.out.println("Usando for: " + i);
        }
    }
}
