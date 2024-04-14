public class Busca {

    public static void main(String[] args) {

        int[] vetor = {3,5,2,1,4};
        int[] vetorOrdenado = {1, 3, 4, 6, 7, 8};

        System.out.println(buscaLinear(vetor, 1));
        System.out.println(pesquisaBinaria(vetorOrdenado, 7));
    }

    public static int buscaLinear(int[] vetor, int parametro) {
        for (int i = 0; i < vetor.length; i++) {
            if (parametro == vetor[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int pesquisaBinaria(int[] vetor, int parametro) {
        int inicio = 0;
        int fim = vetor.length-1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (parametro < vetor[meio]) {
                fim = meio-1;
            } else  if (parametro > vetor[meio]){
                inicio = meio + 1;
            } else {
                resultado = meio;
                return resultado;
            }
        }
        return -1;
    }

}
