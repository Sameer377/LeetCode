class Solution {
   
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return result;
    }
    
    private void dfs(int nums[],int i){
        if(i==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(nums,i+1);
        subset.remove(subset.size()-1);
        dfs(nums,i+1);
    }
}