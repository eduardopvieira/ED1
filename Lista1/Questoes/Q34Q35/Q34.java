package Q34Q35;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q34 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase = sc.nextLine();
        sc.close();

        String[] fraseCortada = frase.split(" ");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Q34Q35\\output.csv"))) {
            for (int i = 0; i < fraseCortada.length; i++) {
                String pivo = fraseCortada[i];
                int contador = 0;

                if (!pivo.equals("0")) {
                    for (int j = i; j < fraseCortada.length; j++) {
                        if (pivo.equals(fraseCortada[j])) {
                            contador++;
                            fraseCortada[j] = "0";
                        }
                    }

                    String linha = pivo + "," + contador + "\n";
                    writer.write(linha);
                    System.out.println(linha);  // Opcional: imprime no console também
                }
            }
            System.out.println("Resultados salvos em 'output.csv'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
