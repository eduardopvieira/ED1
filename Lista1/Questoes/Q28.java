public class Q28 {
    public static void main(String[] args) {
        
        int[] vetor = {1,7,5,6,8,2,3,9,0,4};
        int pivoMenor = vetor[3]; //Número dentro de uma posição aleatória do vetor, para que a verificação possa funcionar. (No caso, escolhi a posição 3, mas qualquer 1 funciona.)
        int pivoMaior = vetor[3]; //Mesmo motivo mencionado acima.
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < pivoMenor) {
                pivoMenor = vetor[i];
            }
            if (vetor[i] > pivoMaior) {
                pivoMaior = vetor[i];
            }
        }
        System.out.println("O maior numero é " + pivoMaior);
        System.out.println("O menor numero é " + pivoMenor);

    }
}
