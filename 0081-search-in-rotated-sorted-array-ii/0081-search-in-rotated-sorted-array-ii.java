class Solution {
    public boolean search(int[] nums, int target) {
        
        
        
        int n=nums.length;

        if(n==1 && nums[0]==target) return true;
        

        int g=0;
        if(nums[0]>=nums[n-1]){
            for(int i=0;i<n;i++){
                if(nums[i]==target) return true;
                while(i+1<nums.length-1 && nums[i]==nums[i+1]) i++;
                int j=i;
                if(nums[i]>nums[j]){
                    g=i;
                    break;
                }
            }
        }

        int s=g, e =n-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }

        }

        return false;

    }
}