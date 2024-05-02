package Array;

public class MIssingno {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 4, 5 };
        // int sum1 = 0, sum2 = 0;
        // int n = arr.length;
        int[] arr = { 4, 3, 2, 6, 7 };
        int max = arr[0], max2 = arr[0];

        sum1 = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }
        System.out.println("the missing element is:" + (sum1 - sum2));
    }
}
