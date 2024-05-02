package function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Shortest_prime_path {
    static int solve(int num1,int num2){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(num1);
        visited.add(num1);

        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == num2) {
                    return distance;
                }

                List<Integer> neighbors = getPrimeNeighbors(current);

                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }

            distance++;
        }

        return -1; // No path found
    }

    static List<Integer> getPrimeNeighbors(int num) {
        List<Integer> neighbors = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int digit = 0; digit <= 9; digit++) {
                if (i == 0 && digit == 0) {
                    continue; // Skip leading zeros
                }

                int newNum = replaceDigit(num, i, digit);

                if (isPrime(newNum)) {
                    neighbors.add(newNum);
                }
            }
        }

        return neighbors;
    }

    static int replaceDigit(int num, int position, int newDigit) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        digits[position] = newDigit;

        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        int num1=1033;
        int num2=8179;
        System.out.println(solve(num1, num2));
    }
}
