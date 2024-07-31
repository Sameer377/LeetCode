import java.util.Arrays;

public class GeeksForGeeks {

    /**
     * Largest Sum Contiguous Subarray (Kadane’s Algorithm)
     * Last Updated : 03 Jul, 2024
     * Given an array arr[] of size N. The task is to find the sum of the contiguous
     * subarray within a arr[] with the largest sum.
     * 
     * Example:
     * Input: arr = {-2,-3,4,-1,-2,1,5,-3}
     * Output: 7
     * Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.
     * 
     * Input: arr = {2}
     * Output: 2
     * Explanation: The subarray {2} has the largest sum 2.
     * 
     * Input: arr = {5,4,1,7,8}
     * Output: 25
     * Explanation: The subarray {5,4,1,7,8} has the largest sum 25.
     */

    static int sumOfSubArray(int arr[]) {

        int maxSum = 0;
        int sidx = 0, eidx = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (arr.length > 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum += arr[j];
                    if (maxSum < sum) {
                        maxSum = sum;
                        sidx = i;
                        eidx = j;
                    }
                }
            } else {
                maxSum = sum;
            }
            if (i == arr.length - 1) {
                break;
            }
        }

        System.out.println("Sub Array : " + Arrays.toString(Arrays.copyOfRange(arr, sidx, eidx + 1)));
        return maxSum;
    }

    /* Sum of sub array using Kaden's Algorithm */
    static int sumUsingKaden(int arr[]){
        int c=0;
        int m=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            m=Math.max(c,m);

            if(c<0){
                c=0;
            }
        }

        return m;
    }



    public static void main(String[] args) {
        System.out.println(sumUsingKaden(new int[]{5,-4,-2,6,-1}));;
    }
}
 
