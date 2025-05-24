class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n*2; i++) {

            int j=i%n;

            while (!stack.isEmpty() && nums[j] > nums[stack.peek()]) {

                int idx = stack.pop();
                res[idx] = nums[j];

            }

            if(i<n)
            stack.push(i);

        }

        return res;

    }
}