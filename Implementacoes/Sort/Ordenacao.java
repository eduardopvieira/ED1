import java.util.Arrays;

public class Ordenacao {

    public static void main(String[] args) {
        int[] vetor = {5, 1, 4, 3, 6, 2};
        int[] vetor2 = {6, 2, 4, 3, 5, 1};
        int[] vetorOrdenado = {1, 2, 3, 4, 5, 6};

        //BubbleSort(vetor);
        //SelectSort(vetor);
        //QuickSort(vetor, 0, vetor.length-1);
        //ShellSort(vetor);
        //InsertSort(vetor);
    }


    public static void BubbleSort(int[] vetor) {
        System.out.println("=============== BUBBLE SORT: ===============");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int pivo = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = pivo;
                }
            }
            System.out.println("Iteração " + (i + 1) + ": " + Arrays.toString(vetor));
        }
    }

    public static void SelectSort (int[] vetor) {
        System.out.println("=============== SELECT SORT: ===============");
        for (int i = 0; i < vetor.length; i++) {
            int numeroSelecionado = i;
            for (int j = (i+1); j < vetor.length; j++ ) {
                if (vetor[j] < vetor[numeroSelecionado]) {
                    numeroSelecionado = j;
                }
            }
            int temp = vetor[numeroSelecionado];
            vetor[numeroSelecionado] = vetor[i];
            vetor[i] = temp;
            System.out.println("Iteração " + (i + 1) + ": " + Arrays.toString(vetor));
        }
    }

    public static void InsertSort(int[] vetor) {
        System.out.println("=============== INSERT SORT: ===============");
        for (int i = 1; i < vetor.length; i++) {
            int j = i-1;
            int aux = vetor[i];
            while (j >= 0 && aux < vetor[j]) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
            System.out.println("Iteração " + (i + 1) + ": " + Arrays.toString(vetor));
        }
    }

    public static void ShellSort(int[] vetor) {
        System.out.println("=============== SHELL SORT: ===============");
        int h = 1;
        int tamanho = vetor.length;
        int valor, j;
        int contador = 0;
        while (h < tamanho) {
            h = h * 3 + 1;
        }

    public static void ShellSort(int[] vetor) {
        int h = 1;
        int tamanho = vetor.length;
        int valor;
        int j;
        int contador = 0;

        while (h < tamanho) {
            h = h * 3  + 1;
        }

        while (h > 1) {
            h = h/3;

            for (int i = h; i < tamanho; i++) {
                valor = vetor[i];
                j = i - h;
                while(j >= 0 && valor < vetor[j]) {
                    vetor[j + h] = vetor[j];
                    j = j-h;
                }
                vetor[j+h] = valor;
                contador++;
                System.out.println("Iteração " + contador + ": " + Arrays.toString(vetor));
            }

        }
    }

    public static void QuickSort(int[] vetor, int inicio, int fim) {
        int pivo = vetor[(inicio + fim)/2];
        int l = inicio;
        int r = fim;
        int contador = 0;

        while (l <= r) {
            while (vetor[l] < pivo) { l++; }
            while (vetor[r] > pivo) { r--; }

            if (l <= r) {
                int temp = vetor[l];
                vetor[l] = vetor[r];
                vetor[r] = temp;
                l++;
                r--;
                contador++;
                System.out.println("Iteração " + contador + ": " + Arrays.toString(vetor));
            }

        }
        if (inicio < r) { QuickSort(vetor, inicio, r);}
        if (l < fim) { QuickSort(vetor, l, fim); }
    }



    public static void SelectSortTeste(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i; //indice do menor = numero da iteracao, valor inicial pra nao percorrer td

            for (int j = i+1; j < vetor.length; j++) { //j vai percorrendo na frente, pra nao ter que percorrer do 0 toda vez
                if (vetor[j] < vetor[menor]) { //se o j encontrar algum valor menor que o do indice do menor
                    menor = j; //o indice do menor passa a ser J
                }
            }

            if (menor != i) { //se menor for qualquer outro numero que nao o menor inicial "I"
                int temp = vetor[i]; //faz o swap
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }
        }
    }
}


