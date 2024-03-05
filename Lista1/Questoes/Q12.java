import java.util.Scanner;

public class Q12 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;
        boolean recuperacao = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 7.0) {
            System.out.println("Recuperação");
            recuperacao = true;
        } else {
            System.out.println("Reprovado");
        }

        if (recuperacao) {
            System.out.println("Digite a nota da recuperação: ");
            double notaRec = sc.nextDouble();

            media = (media * 6 + notaRec * 4) / 10;

            if (media >= 5.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        sc.close();
    }
}
