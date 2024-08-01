import java.util.*;

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

        int midx = 0;
        for (int d = 0; d < arr1.length; d++) {
            arr1[d] = merge[midx++];
        }

        for (int f = 0; f < arr2.length; f++) {
            arr2[f] = merge[midx++];
        }

    }

    /*
     * Given an array of intervals where intervals[i] = [starti, endi], merge all
     * overlapping intervals, and return an array of the non-overlapping intervals
     * that cover all the intervals in the input.
     * 
     * Example 1:
     * 
     * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     * Example 2:
     * 
     * Input: intervals = [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     */
    public static int[][] merge(int intervals[][]) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int newinterval[] = intervals[0];
        result.add(newinterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newinterval[1]) {
                newinterval[1] = Math.max(interval[1], newinterval[1]);
            } else {
                newinterval = interval;
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    /*
     * Find the Duplicate Number
     * Medium
     * Topics
     * Companies
     * Given an array of integers nums containing n + 1 integers where each integer
     * is in the range [1, n] inclusive.
     * 
     * There is only one repeated number in nums, return this repeated number.
     * 
     * You must solve the problem without modifying the array nums and uses only
     * constant extra space.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,4,2,2]
     * Output: 2
     * Example 2:
     * 
     * Input: nums = [3,1,3,4,2]
     * Output: 3
     * Example 3:
     * 
     * Input: nums = [3,3,3,3,3]
     * Output: 3
     */

    static int findDuplicate(int arr[]) {

        int n = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {

            } else {
                n = arr[i];
            }
        }

        return n;
    }

    static int findDuplicate1(int arr[]) {

        int l = arr.length;
        boolean x[] = new boolean[l];

        for (int i : arr) {
            if (x[i])
                return i;
            else
                x[i] = true;
        }

        return -1;

    }

    /*
     * Rotate Image
     * Medium
     * Topics
     * Companies
     * You are given an n x n 2D matrix representing an image, rotate the image by
     * 90 degrees (clockwise).
     */
    public static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int s = 0, e = matrix[i].length - 1;
            while (s < e) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }

    }

    /*
     * Search a 2D Matrix
     * Medium
     * Topics
     * Companies
     * You are given an m x n integer matrix matrix with the following two
     * properties:
     * 
     * Each row is sorted in non-decreasing order.
     * The first integer of each row is greater than the last integer of the
     * previous row.
     * Given an integer target, return true if target is in matrix or false
     * otherwise.
     * 
     * You must write a solution in O(log(m * n)) time complexity.
     */

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    /*
     * 169. Majority Element
     * Easy
     * Topics
     * Companies
     * Given an array nums of size n, return the majority element.
     * 
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You
     * may assume that the majority element always exists in the array.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,2,3]
     * Output: 3
     * Example 2:
     * 
     * Input: nums = [2,2,1,1,1,2,2]
     * Output: 2
     */

     public  static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int i=0;
        int maxC=0;
        int ele=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                if(maxC<j-1){
                    maxC=j-i;
                    ele=nums[j];
                }
                i=j; 
            }
            j++;
        }
        return ele;
    }

    public static void main(String[] args) {

    int[] nums = {2,2,1,1,1,2,2,3,3};
    int majority = majorityElement(nums);
    System.out.println("Majority Element: " + majority);
    }
}
