import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        
        int a, b, c, delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();

        delta = delta(a, b, c);

        if (delta < 0) {
            System.out.println("Não existem raízes reais");
        } else if (delta >= 0) {
            System.out.println("Raiz 1 : " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("Raiz 1 : " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }
        sc.close();
    }

    public static int delta(int a, int b, int c) {

        int delta = (b * b) - (4 * a * c);
        System.out.println(delta);
        return delta;

    }

}
