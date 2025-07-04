class Solution {

    public Set<List<Integer>> mainlist = new HashSet<>();

    public List<Integer> list= new ArrayList<>();


    public void findSub(int nums[],int idx){

        if(idx==nums.length){
            mainlist.add(new ArrayList<>(list));
            return; 
        }

        list.add(nums[idx]);
        findSub(nums,idx+1);
        list.remove(list.size()-1);
        findSub(nums,idx+1);
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        findSub(nums,0);
        return new ArrayList<>(mainlist);       
    }
}