public class Q27 {
    public static void main(String[] args) {
        
        int[] vetor = {1,7,5,6,8,2,3,9,0,4};
        int tamVet = vetor.length;
        int percorrer;
        //Verificar onde está a metade do vetor.
        if (tamVet %2 == 0) {
            percorrer = tamVet/2;
        } else {
            percorrer = (tamVet/2) + 1;
        }

        
        for (int i = 0; i < percorrer; i++) {
            int pivo = vetor[i];
            vetor[i] = vetor[tamVet - i - 1];
            vetor[tamVet - i - 1] = pivo;
        }

        for (int i = 0; i < tamVet; i++) {
            System.out.println(vetor[i]);
        }
    }
}
