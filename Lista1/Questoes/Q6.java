import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
   
        int pessoasMesa, qtdRefri, qtdPizza;
        double totalSemTaxa, totalComTaxa;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de refrigerante: ");
        qtdRefri = sc.nextInt();
        System.out.println("Digite a quantidade de fatias de pizza: ");
        qtdPizza = sc.nextInt();
        System.out.println("Digite a quantidade de pessoas na mesa: ");
        pessoasMesa = sc.nextInt();

        totalSemTaxa = (qtdRefri * 1.50) + (qtdPizza * 3);
        totalComTaxa = totalSemTaxa + (totalSemTaxa * 0.10);

        System.out.println("Total sem taxa: " + totalSemTaxa);
        System.out.println("Total com taxa: " + totalComTaxa);
        System.out.println("Valor por pessoa (rateio): " + (totalComTaxa / pessoasMesa));
        sc.close();
    }
}
