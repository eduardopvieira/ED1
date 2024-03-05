import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        if (raio == 0) {
            System.out.println("Raio não pode ser nulo.");
        } else {
            System.out.println("Área do círculo: " + (Math.PI * Math.pow(raio, 2)));
        }
        sc.close();
    }
    
}
