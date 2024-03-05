import java.util.Scanner;

public class Q5 {
       public static void main(String[] args) {
        double n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        n2 = sc.nextDouble();
        System.out.println("Digite o terceiro número");
        n3 = sc.nextDouble();

        System.out.println("Média: " + ((n1 + n2 + n3) / 3));
        sc.close();
    }
    

}
