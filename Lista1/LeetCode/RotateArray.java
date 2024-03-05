class RotateArray {
    public static void rotate(int[] nums, int k) {
        int tamVet = nums.length;
        k = k % tamVet;
        int[] rotatedArray = new int[tamVet];

        for (int i = 0; i < tamVet; i ++) {
            rotatedArray[(i+k)%tamVet] = nums[i];
        }

        for (int i = 0; i < tamVet; i++) {
            nums[i] = rotatedArray[i];
        }
    }
}