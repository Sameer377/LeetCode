import java.util.ArrayList;
import java.util.List;
public class LeetCodePattern {
    /*
     * Pascal's Triangle
     * Easy
     * Topics
     * Companies
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     */
    public static void pascalsTriangle(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a.add(1);
                } else {
                    if (i > 1) {
                        if (arr.get(i - 1).size() >= j) {
                            a.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
                        }
                    }
                }
            }
            arr.add(a);
        }
        for (List<Integer> row : arr) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pascalsTriangle(5);
    }
}
