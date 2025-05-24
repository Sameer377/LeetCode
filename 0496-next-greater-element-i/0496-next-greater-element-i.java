class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            map.put(nums2[i], -1);
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                map.put(nums2[stack.pop()], nums2[i]);
            }

            stack.push(i);

        }

        for (int i = 0; i < nums1.length; i++) {
            int t = nums1[i];
            nums1[i] = map.get(t);
        }

        return nums1;

    }
}