import java.util.ArrayList;
import java.util.List;

public class LeetCode2 {

    /*
     * Set Matrix Zeroes
     * Medium
     * Topics
     * Companies
     * Hint
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row
     * and column to 0's.
     * 
     * You must do it in place.
     * 
     */

    public int[][] setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int arr[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < col; k++) {
                        matrix[i][k] = 0;
                    }

                    for (int l = 0; l < row; l++) {
                        matrix[l][j] = 0;
                    }
                }

            }

        }

        return matrix;
    }

    /*
     * Given an array of integers. Find the Inversion Count in the array. Two array
     * elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
     * 
     * Inversion Count for an array indicates – how far (or close) the array is from
     * being sorted. If the array is already sorted, then the inversion count is 0,
     * but if the array is sorted in reverse order, the inversion count is the
     * maximum.
     */

    public static int inversion(int arr[]) {

        List<List<Integer>> res = new ArrayList<>();

        int inversioncount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversioncount++;
                }
            }
            res.add(a);
        }

        return inversioncount;
    }

    /*
     * Best Time to Buy and Sell Stock
     * Easy
     * Topics
     * Companies
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
     * 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you
     * must buy before you sell.
     * Example 2:
     * 
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     */


     public static int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices){
            min = Math.min(min, i);
            max = Math.max(max, i-min);

        }
        System.out.println(max);
        return max;
     }

     

    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }

}
