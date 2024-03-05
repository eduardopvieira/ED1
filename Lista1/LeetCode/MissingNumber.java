public class MissingNumber {
    
    public static void main(String[] args) {
        int[] teste = {0,1};
        System.out.println(missingNumber(teste));
    }
    
    public static int missingNumber(int[] nums) {
        
        int tamanho = nums.length;
        int[] comparando = new int[tamanho + 1];


        for (int i = 0; i < tamanho; i++) {
            comparando[nums[i]] = 1;
        }

        for (int i = 0; i < tamanho; i++) {
            if (comparando[i] != 1) {
                return i;
            }
        }
        return tamanho;
    }
}
