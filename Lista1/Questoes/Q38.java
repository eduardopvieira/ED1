public class Q38 {
    public static void main(String[] args) {
        Integer array[] = {0,1,2};
        String arrayString[] = {"eduardo", "paz", "vieira"};
        PrintarObjeto(38);
        PrintarVetor(array);
        PrintarVetor(arrayString);
    }

    public static <E> void PrintarObjeto(E objeto) {
        System.out.println(objeto);
    }

    public static <E> void PrintarVetor(E[] array) {
        for (E objeto : array) {
            System.out.println(objeto);
        }
    }
}