class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right=0;right<nums.length;right++){
            
            if(map.containsKey(nums[right]) && Math.abs(map.get(nums[right])-right) <= k){
                return true;
            }else{
                map.put(nums[right],right);
            }            


            
        }
return false;
    }
}