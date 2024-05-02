public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sort(arr, si, mid);
        sort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator forleft
        int j = mid + 1;// iter for right
        int k = 0;// iter for temporary allocation of element

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // leftover
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length;k++, i++) {
            arr[i] = temp[k];
        }

    }
}
