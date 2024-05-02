package Array;

public class Max2 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int max = arr[0], max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println("max2 element is " + max2);
    }
}
