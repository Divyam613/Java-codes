package Array;

public class orderofnumber {
    public static void main(String[] args) {
        // int[] arr = { 0, 0, 1, 0, 1, 1, 0 };
        int[] arr = { 0, 1, 2, 0, 2, 2, 1, 0, 1 };
        int ccount = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ccount++;
            }
            if (arr[i] == 1) {
                count++;
            }
        }
        for (int i = 0; i < ccount; i++) {
            System.out.print(0 + ",");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(1 + ",");
        }
        int k = ccount + count;
        for (int i = k; i < arr.length; i++) {
            System.out.print(2 + ",");
        }
    }
}
