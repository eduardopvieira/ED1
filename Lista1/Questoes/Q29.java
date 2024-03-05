public class Q29 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tamanhoVetor = vetor.length - 1;
        int posAtual = tamanhoVetor;
        int pivo;

        for (int i = 0; i < tamanhoVetor; i++) {
            pivo = vetor[posAtual];
            vetor[posAtual] = vetor[posAtual - 1];
            vetor[posAtual-1] = pivo;
            posAtual = posAtual - 1;
        }

        for (int i = 0; i <= tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
    }
}

