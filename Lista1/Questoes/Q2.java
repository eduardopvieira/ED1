import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        char primLetra;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();

        sc.nextLine();

        System.out.println("Digite a primeira letra do seu nome: ");
        primLetra = sc.next().charAt(0);

        sc.nextLine();

        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();
        
        sc.close();


        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Primeira letra:" + primLetra);
        System.out.println("Nome: " + nome);
        
    }


}
