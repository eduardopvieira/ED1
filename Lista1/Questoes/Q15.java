import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.println("Um");
                break;
            case 2: 
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default: 
                System.out.println("Valor Inválido");
                break;
        }
    }
}
