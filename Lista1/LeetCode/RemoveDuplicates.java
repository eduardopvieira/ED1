public class RemoveDuplicates {
    
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,3,4};
        System.out.println("Tamanho sem duplicatas:" + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int tamanho = nums.length;
        int numerosUnicos = 1;

        for (int i = 1; i < tamanho; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[numerosUnicos] = nums[i];
                numerosUnicos++;
            }
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(nums[i]);
        }
        
        return numerosUnicos;
    }
}
