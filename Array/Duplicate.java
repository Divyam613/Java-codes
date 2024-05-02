package Array;

import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2 };
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) > 1) {
                System.out.println(num);
            }
        }
    }
}
