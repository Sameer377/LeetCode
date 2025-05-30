class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }

        return false;
    }
}