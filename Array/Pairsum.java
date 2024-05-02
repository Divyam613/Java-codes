package Array;

import java.util.Scanner;

public class Pairsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target value");
        int n = sc.nextInt();
        // int n = 10;
        int arr[] = { 3, 2, 4, 6, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        sc.close();
    }
}
