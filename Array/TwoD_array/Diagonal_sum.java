package Array.TwoD_array;

public class Diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int sumD = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
                sumD += matrix[i][i];
            if (i != matrix.length - 1-i) {
                
                sumD += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sumD);
    }
}
