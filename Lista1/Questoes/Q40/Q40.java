package Q40;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Q40 {

    public static void main(String[] args) {

        String arquivo = "Q40\\texto.txt";
        char[] arrayCarac = lerArquivo(arquivo);
        char[] arrayCodificado = codificarOuDecodificar(arrayCarac);
        gerarArquivoCodificado(arrayCodificado);
        char[] arrayDecodificado = codificarOuDecodificar(arrayCodificado);
        gerarArquivoDecodificado(arrayDecodificado);

    }

    public static char[] lerArquivo(String arquivo) {
        try {
            File file = new File(arquivo);
            Scanner scanner = new Scanner(file);

            StringBuilder leitor = new StringBuilder();
            while (scanner.hasNextLine()) {
                leitor.append(scanner.nextLine());
                leitor.append(System.lineSeparator());
            }
            scanner.close();

            // Convertendo o conteúdo para um array de caracteres
            char[] arrayChar = leitor.toString().toCharArray();

            return arrayChar;

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }
        return null;
    }

    
    public static void gerarArquivoCodificado(char[] arrayCarac) {
        String fileName = "Q40\\codificado.txt";
        try {
            FileWriter escritor = new FileWriter(fileName);

            for (char c: arrayCarac) {
                escritor.write(c);
            }

            escritor.close();
            System.out.println("Arquivo " + fileName + " gerado com sucesso");

        } catch (IOException e) {
            System.out.println("Deu errado");
            e.printStackTrace();
        }
        
    }

    public static void gerarArquivoDecodificado(char[] arrayCarac) {
        String fileName = "Q40\\decodificado.txt";
        try {
            FileWriter escritor = new FileWriter(fileName);

            for (char c: arrayCarac) {
                escritor.write(c);
            }

            escritor.close();
            System.out.println("Arquivo " + fileName + " gerado com sucesso");

        } catch (IOException e) {
            System.out.println("Deu errado");
            e.printStackTrace();
        }
        
    }

    public static char[] codificarOuDecodificar (char[] arrayCarac) {
        
        HashMap<Character, Character> mapa = new HashMap<Character, Character>();

        mapa.put('Z', 'P');
        mapa.put('P', 'Z');
        mapa.put('E', 'O');
        mapa.put('O', 'E');
        mapa.put('N', 'L');
        mapa.put('L', 'N');
        mapa.put('I', 'A');
        mapa.put('A', 'I');
        mapa.put('T', 'R');
        mapa.put('R', 'T');

//==============LETRAS MINUSCULAS: ==========================

        mapa.put('z', 'p');
        mapa.put('p', 'z');
        mapa.put('e', 'o');
        mapa.put('o', 'e');
        mapa.put('n', 'l');
        mapa.put('l', 'n');
        mapa.put('i', 'a');
        mapa.put('a', 'i');
        mapa.put('t', 'r');
        mapa.put('r', 't');

        
        char caractere;
        for (int i = 0; i < arrayCarac.length; i++) {
            caractere = arrayCarac[i];
            if (mapa.containsKey(caractere)) {
                char letraCodificada = mapa.get(caractere);
                arrayCarac[i] = letraCodificada;
            }
        }
        return arrayCarac;
    }

}
