package Array;

import java.util.HashMap;

public class Majorityelements {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 1, 1 };
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : arr) {
            if (n / 2 < map.get(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}