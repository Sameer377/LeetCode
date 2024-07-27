public class LeetCodeArray {

    /*
     * Find the missing and repeating number
     * Last Updated : 18 Jul, 2024
     * Given an unsorted array of size n. Array elements are in the range of 1 to n.
     * One number from set {1, 2, …n} is missing and one number occurs twice in the
     * array. Find these two numbers.
     * 
     * Examples:
     * 
     * Input: arr[] = {3, 1, 3}
     * Output: Missing = 2, Repeating = 3
     * Explanation: In the array, 2 is missing and 3 occurs twice
     * 
     * Input: arr[] = {4, 3, 6, 2, 1, 1}
     * Output: Missing = 5, Repeating = 1
     */

    static void missingNum(int arr[]) {
        int sum = 0;
        int total = 0;
        int rep = 0;
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            sum += i + 1;
            total += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    rep = arr[i];
                }
            }
        }
        total += arr[arr.length - 1];
        sum += i + 1;

        System.out.println("Missing num  : " + (sum - (total - rep)));
        System.out.println("Repeated num : " + rep);

    }

    /*
     * Efficiently merging two sorted arrays with O(1) extra space
     * Last Updated : 16 May, 2024
     * Given two sorted arrays, we need to merge them in O((n+m)*log(n+m)) time with
     * O(1) extra space into a sorted array, when n is the size of the first array,
     * and m is the size of the second array.
     * 
     * Example:
     * 
     * Input: ar1[] = {10};
     * ar2[] = {2, 3};
     * Output: ar1[] = {2}
     * ar2[] = {3, 10}
     * 
     * Input: ar1[] = {1, 5, 9, 10, 15, 20};
     * ar2[] = {2, 3, 8, 13};
     * Output: ar1[] = {1, 2, 3, 5, 8, 9}
     * ar2[] = {10, 13, 15, 20}
     */

    static void printarr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void mergeArrays(int arr1[], int arr2[]) {

        int totallength = arr1.length + arr2.length;
        int merge[] = new int[totallength];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }

        int midx=0;
        for(int d=0;d<arr1.length;d++){
            arr1[d]=merge[midx++];
        }

        for(int f=0;f<arr2.length;f++){
            arr2[f]=merge[midx++];
        }


    }



    public static void main(String[] args) {

    int arr1[] = {1, 5, 9, 10, 15, 20};
    int arr2[] = {2, 3, 8, 13};

    mergeArrays(arr1, arr2);
    printarr(arr1);
    System.out.println("\n");
    printarr(arr2);


    }
}
