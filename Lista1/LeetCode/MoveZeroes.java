class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int qtdNums = nums.length;

        for (int i = 0; i < qtdNums; i++) {
            if (nums[i] == 0) {
                // Procurando elementos que nao sejam 0:
                int j = i + 1; //Coloca o j a frente do i
                while (j < qtdNums && nums[j] == 0) { //vai percorrendo o vetor de números até o J ser algum número não-nulo
                    j++;
                }
            
                // Reliza a troca do zero pelo nao-zero
                if (j < qtdNums) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}
