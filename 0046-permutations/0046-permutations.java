class Solution {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void helper(int nums[],int idx,List<List<Integer>> list){

        if(idx==nums.length){
            List<Integer> temp = new ArrayList<>();
for (int num : nums) temp.add(num);
list.add(temp);

            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            helper(nums,idx+1,list);
            swap(nums,idx,i);
        }


    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums,0,list);
        return list;
    }
}