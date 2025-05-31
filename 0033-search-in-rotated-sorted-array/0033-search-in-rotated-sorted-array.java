class Solution {
    public int search(int[] nums, int target) {
        
        int g=0;
        int n=nums.length;

        if(nums[0]>nums[n-1]){
        for(int i=0;i<n-1;i++){
            if(nums[i]==target) return i;
            int j=i+1;

            if(nums[i]>nums[j]){
                g=j;
                break;
            }

        }
        }

        int s=g,e=n-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        return -1;

    }
}