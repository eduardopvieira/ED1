import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
        
        System.out.println("Usando repeticao: " + somatorioRepeticao(n1, n2));
        System.out.println("Usando recursividade: " + somatorioRecursivo(n1, n2));
    }

    public static int somatorioRepeticao(int inicio, int fim) {
        int somatorio = 0;
        for (int i = inicio; i <= fim; i++) {
            somatorio = somatorio + i;
        }

        return somatorio;
    }

    public static int somatorioRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return inicio;
        }

        return inicio + (somatorioRecursivo(inicio + 1, fim));
    }
}


//Vantagens da repetição: 
//Desvantagens da repetição: 


//Vantagens da recursividade: Dependendo do caso, pode tornar o código mais legivel e algumas tarefas sao mais facilmente resolvidas usando recursividade (como calculo de fatorial)
//Desvantagens da recursividade: Consome mais memória por ter que fazer a mesma função diversas vezes e tem menor desempenho


