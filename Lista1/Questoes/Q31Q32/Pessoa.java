package Q31Q32;
import java.io.Serializable;


public class Pessoa implements Serializable {
    String cpf, nome, sexo;
    int idade;
    double peso, altura, imc;

    public Pessoa () {}

    public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura, double imc) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }
    
}
