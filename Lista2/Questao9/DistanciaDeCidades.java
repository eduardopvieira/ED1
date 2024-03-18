package Questao9;

import java.util.Scanner;

import Exception.MyException;
import Questao2.Fila;

public class DistanciaDeCidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Se a matriz for digitada manualmente, ir na função "preencherMatrizDistancia". Lá tem a matriz completa, é só alterar os valores pra poupar tempo.
        System.out.println("A matriz de distância foi digitada no código ou será por input?\n 1 - Está no codigo || Qualquer outro numero - Input");
        int resposta = sc.nextInt();
        int[][] matrizDistancia = preencherMatrizDistancia(resposta, sc);
        int qtdCidades = matrizDistancia.length;
        
        System.out.println("Matriz de distâncias: ");
        for (int i = 0; i < qtdCidades; i++) {
            for (int j = 0; j < qtdCidades; j++) {
                System.out.print(matrizDistancia[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Cidade inicial: ");
        int cidadeInicial = sc.nextInt();

        int[] vetorResultado = criarVetorResultado(qtdCidades, cidadeInicial);

        Fila<Integer> fila = new Fila<>(qtdCidades);
        fila.add(cidadeInicial);


        while (!fila.isEmpty()) {
            try {
                int cidadeAtual = fila.remove();
                
                for (int i = 0; i < qtdCidades; i++) {
                    int distancia = matrizDistancia[cidadeAtual][i];
                    if (distancia > 0 && vetorResultado[i] == -1) {
                        vetorResultado[i] =  vetorResultado[cidadeAtual] + distancia;
                        fila.add(i);
                    }
                }
            } catch (MyException e) {
                e.printStackTrace();
            }
        }

        int cont = 0;

        for (int i : vetorResultado) {
            if (i == -1) {
                System.out.println("Distancia da cidade " + cidadeInicial + " para a cidade " + cont + ": Não alcançável.");
            } else {
                System.out.println("Distancia da cidade " + cidadeInicial + " para a cidade " + cont + ": " + i);
            }
            cont++;
        }
        sc.close();

    }

    public static int[][] preencherMatrizDistancia(int resposta, Scanner sc) {
        if (resposta == 1) {
            int[][]matrizDistancia = 
            {
            //   0  1  2  3  4  5
                {0, 3, 0, 0, 0, 0}, //CIDADE 0
                {0, 0, 1, 0, 0, 0}, //CIDADE 1
                {0, 0, 0, 0, 1, 0}, //CIDADE 2
                {0, 0, 2, 0, 1, 0}, //CIDADE 3
                {1, 0, 0, 0, 0, 0}, //CIDADE 4
                {0, 1, 0, 0, 0, 0}  //CIDADE 5
            }; 
            return matrizDistancia;
        } 
        else 
        {
            int qtdCidades = 0;
            System.out.println("Quantas cidades? ");
            qtdCidades = sc.nextInt();
            int[][] matrizDistancia = new int[qtdCidades][qtdCidades];        
        
       

            for (int i = 0; i < qtdCidades; i++) {
                for (int j = 0; j < qtdCidades; j++) {
                    if (i != j) {
                        System.out.println("Digite a distância da cidade " + (i) + " para a cidade " + (j) + ":");
                        matrizDistancia[i][j] = sc.nextInt();
                    } else {
                        matrizDistancia[i][j] = 0;
                    }
                }
            }
            return matrizDistancia;
        }   
    }

    public static int[] criarVetorResultado(int n, int cidadeInicial) {
        int[] vetorResultado = new int[n];

    
        for (int i = 0; i < n; i++) {
            if(i == cidadeInicial){
                vetorResultado[i] = 0;
            } else{
                vetorResultado[i] = -1;
            }
        }
        return vetorResultado;
    }
}