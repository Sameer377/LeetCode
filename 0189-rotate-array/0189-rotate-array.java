class Solution {

    public void reverse(int nums[],int l,int r){
        while(l<=r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {


        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}