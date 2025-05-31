class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int arr[] = new int[101];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(n>1){
                ans+=(n*(n-1))/2;
            }
        }

        return ans;
    }
}