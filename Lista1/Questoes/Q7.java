import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
    
        double n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        n2 = sc.nextDouble();

        if (n2 == 0) {
            System.out.println("Não é possível dividir por zero");
        } else {
            System.out.println("Quociente da Divisão:" + (n1 / n2));
        }
        sc.close();

    }


    
}
