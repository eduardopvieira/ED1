class Q23 {
    public static void main(String[] args) {
        System.out.println(fatorialIterativo(5));
        System.out.println(fatorialRecursivo(5));
    }

    static int fatorialIterativo(int n) {
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

    static int fatorialRecursivo (int n) {
        if (n == 1 || n == 00) {
            return 1;
         } else {
            return n * fatorialRecursivo(n-1);
         }
        
    }

}