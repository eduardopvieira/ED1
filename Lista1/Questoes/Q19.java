import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult); 
        }
        sc.close();

    }
}
