package Array;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[]={1,2,3,4,5}
        // int[] arr2 ={1,2,3,4,5}
        int dy[] = new int[5];
        System.out.println("enter the values");
        for (int i; i < dy.length; i++) {
            dy[i] = sc.nextInt();
        }
        for (int i = 0; i < dy.length; i++) {
            System.out.println(dy[i] + "");
        }
        sc.close();
    }
}
