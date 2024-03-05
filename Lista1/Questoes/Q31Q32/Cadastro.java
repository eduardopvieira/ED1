package Q31Q32;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        int qtdPessoas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão cadastradas? ");
        qtdPessoas = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];


        for (int i = 0; i < qtdPessoas; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("cpf: "); 
            pessoas[i].cpf = sc.nextLine();
            sc.nextLine();

            System.out.println("nome: ");
            pessoas[i].nome = sc.nextLine();

            System.out.println("idade: ");
            pessoas[i].idade = sc.nextInt();
            sc.nextLine();

            System.out.println("sexo: ");
            pessoas[i].sexo = sc.nextLine();

            System.out.println("peso: ");
            pessoas[i].peso = sc.nextDouble();

            System.out.println("altura: ");
            pessoas[i].altura = sc.nextDouble();

            pessoas[i].imc = pessoas[i].peso/ (pessoas[i].altura * pessoas[i].altura);
        }

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("------- PESSOA " + (i+1) + ": ------");
            System.out.println("CPF: " + pessoas[i].cpf);
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("Idade: " +pessoas[i].idade);
            System.out.println("Sexo: " + pessoas[i].sexo);
            System.out.println("Peso: " + pessoas[i].peso);
            System.out.println("Altura: " + pessoas[i].altura);
            System.out.println("IMC:: " + pessoas[i].imc);
        }

        sc.close();

        salvarEmArquivoBinario(pessoas, "pessoas.bin");


         // Carregar e exibir dados do arquivo binário
        Pessoa[] pessoasLidas = carregarDeArquivoBinario("pessoas.bin");

        if (pessoasLidas != null) {
            for (Pessoa pessoa : pessoasLidas) {
                System.out.println("------- PESSOA -------");
                System.out.println("CPF: " + pessoa.cpf);
                System.out.println("Nome: " + pessoa.nome);
                System.out.println("Idade: " + pessoa.idade);
                System.out.println("Sexo: " + pessoa.sexo);
                System.out.println("Peso: " + pessoa.peso);
                System.out.println("Altura: " + pessoa.altura);
                System.out.println("IMC: " + pessoa.imc);
            }
        }
    }

    private static void salvarEmArquivoBinario(Pessoa[] pessoas, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(pessoas);
            System.out.println("Dados salvos com sucesso. Arquivo: " + nomeArquivo);
        } catch (Exception e) {
            System.err.println("Erro ao salvar os dados no arquivo binário: " + e.getMessage());
        }
    }

    private static Pessoa[] carregarDeArquivoBinario(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (Pessoa[]) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os dados do arquivo binário: " + e.getMessage());
        }
        return null;
    }

}
