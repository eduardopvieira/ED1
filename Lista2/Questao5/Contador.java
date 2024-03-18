package Questao5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import Exception.MyException;
import Questao3.ListaSimples;

public class Contador {
    public static void main(String[] args) throws MyException {
        ListaSimples<String> listaPalavras = new ListaSimples<>();
        Map<String, Integer> contador = new HashMap<>();

        String fileName = "Lista2/Questao5/texto.txt";
        String arquivoTextoSalvo = "Lista2/Questao5/txtSalvo.txt";
        String arquivoBinSalvo = "Lista2/Questao5/binSalvo.bin";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            
            String linha;
            
            while ((linha = br.readLine()) != null) {
                
                String[] palavrasLinha = linha.split("\\s+");
                
                for (String palavra : palavrasLinha) {
                    listaPalavras.addLast(palavra.toLowerCase());
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        //Contador de fato
        while (listaPalavras.isEmpty() == false) 
        {
            String palavra = listaPalavras.peekFirst();

            if (contador.containsKey(palavra)) 
            {
                contador.put(palavra, contador.get(palavra)+1);
            }
            else
            {
                contador.put(palavra, 1);
            }
            listaPalavras.removeFirst();
        }

        salvarMapaEmArquivoBinario(contador, arquivoBinSalvo);
        salvarMapaEmArquivoTexto(contador, arquivoTextoSalvo);

        System.out.println("====================ARQUIVO BINARIO:==================================");
        lerArquivoBinario(arquivoBinSalvo);
        System.out.println("====================ARQUIVO TXT:==================================");
        lerArquivoTexto(arquivoTextoSalvo);

    }


    public static void salvarMapaEmArquivoTexto(Map<String, Integer> mapa, String nomeArquivo) {
        try (FileWriter fw = new FileWriter(nomeArquivo)) {
            for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
                fw.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("HashMap salvo em " + nomeArquivo + " com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar em arquivo de texto: " + e.getMessage());
        }
    }

    public static void salvarMapaEmArquivoBinario(Map<String, Integer> mapa, String nomeArquivo) {
        // Implementação para salvar em arquivo binário
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(mapa);
            System.out.println("HashMap salvo em " + nomeArquivo + " em formato binário com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o HashMap em um arquivo binário: " + e.getMessage());
        }
    }

    public static void lerArquivoTexto(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo txt: " + e.getMessage());
        }
    }

    public static void lerArquivoBinario(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            Map<String, Integer> mapa = (Map<String, Integer>) ois.readObject();
            for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler o arquivo bin: " + e.getMessage());
        }
    }
}

