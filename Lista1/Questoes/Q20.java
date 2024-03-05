import java.util.Scanner;

public class Q20 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Valor principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Taxa de juros (porcentagem): ");
        double taxaJuros = scanner.nextDouble() / 100;

        System.out.print("Tempo (em anos): ");
        double tempo = scanner.nextDouble();

        scanner.close();

        jurosSimples(principal, taxaJuros, tempo);

    }



    public static void jurosSimples (double principal, double taxaJuros, double tempo) {
        
        double juros = principal * taxaJuros * tempo;
        double montante = principal + juros;
 
        System.out.println("\nJuros Simples:");
        System.out.println("Valor Principal: R$" + principal);
        System.out.println("Taxa de Juros: " + (taxaJuros * 100) + "%");
        System.out.println("Tempo: " + tempo + " anos");
        System.out.println("Juros: R$" + juros);
        System.out.println("Montante Total: R$" + montante);

    }
}
