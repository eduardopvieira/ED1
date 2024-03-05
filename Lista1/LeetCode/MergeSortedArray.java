public class MergeSortedArray {
    
    public static void main(String[] args) {
        int[] array1 = {-1,-1,0,0,0,0};
        int[] array2 = {-1,0};
        int tamArray1 = 4;
        int tamArray2 = 2;

        merge(array1, tamArray1, array2, tamArray2);

        for (int elemento : array1) {
            System.out.println(elemento);
        }
    }

    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indiceFinal1 = m - 1;
        int indiceFinal2 = n - 1;
        int indiceMerge = m + n - 1;
    
        while (indiceFinal1 >= 0 && indiceFinal2 >= 0) {
            if (nums1[indiceFinal1] > nums2[indiceFinal2]) {
                nums1[indiceMerge] = nums1[indiceFinal1];
                indiceFinal1--;
            } else {
                nums1[indiceMerge] = nums2[indiceFinal2];
                indiceFinal2--;
            }
            indiceMerge--;
        }
    
        while (indiceFinal2 >= 0) {
            nums1[indiceMerge] = nums2[indiceFinal2];
            indiceFinal2--;
            indiceMerge--;
        }
    }
}
