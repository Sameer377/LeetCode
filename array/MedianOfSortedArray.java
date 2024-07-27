import java.util.Arrays;

public class MedianOfSortedArray {


    public double median(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < res.length; i++) {
            if (i < arr1.length) {
                res[i] = arr1[i];
            } else {
                int t = i - arr1.length;
                res[i] = arr2[t];
            }
        }

        /*Sort Array*/
        Arrays.sort(res);
        if (res.length % 2 == 0) {
            int mid = res.length / 2;
            return ((float) res[mid] + (float) res[mid - 1]) / 2;
        } else {
            return res[res.length / 2];
        }
    }

    public static void main(String[] args) {
        new MedianOfSortedArray().median(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}
