
import java.util.Scanner;

public class Q4 {
 

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número");
        n3 = sc.nextInt();

        System.out.println("Média: " + ((n1 + n2 + n3) / 3));
        sc.close();
    }


}
