class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0]=nums[0];

        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1]+nums[i];
        }

        nums[0] = prefix[n-1]-prefix[0];
        if(n>1)
        nums[n-1] = prefix[n-2]; 

        for(int i=1;i<n-1;i++){
            int d = (prefix[n-1]-prefix[i]) - prefix[i-1];
            nums[i]=(d<0)?-d:d;
        }

        return nums;
    }
}