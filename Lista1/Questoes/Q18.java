import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        String senha = "eduardo";
        String senhaDigitada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senha.equals(senhaDigitada)) {
            System.out.println("Senha incorreta, digite novamente: ");
            senhaDigitada = sc.nextLine();
        }
        System.out.println("Senha correta, acesso liberado");


        do {
            System.out.println("Senha incorreta, digite novamente: ");
            senhaDigitada = sc.nextLine();
        } while (!senha.equals(senhaDigitada));
        System.out.println("Senha correta, acesso liberado");
        sc.close();
    }
}
