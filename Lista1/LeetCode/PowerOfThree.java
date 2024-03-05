public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(20412));
    }
    
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n%3 == 0) {
            n = n/3;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }
}
