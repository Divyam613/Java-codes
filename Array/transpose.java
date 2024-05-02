package Array;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int size = arr[0].length;
        int[][] transpose = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < size; i++) {

        }
    }

}
