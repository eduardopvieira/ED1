import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double altura, peso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        if (altura == 0) {
            System.out.println("Não é possível calcular o IMC");
        } else {
            System.out.println("IMC: " + (peso / (altura * altura)));
        }
        sc.close();
    }
}
