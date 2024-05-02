package Array;

public class Arraysumming {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum is " + sum);
    }
}
