class Solution {
    
    
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int sum=0;
            int l=i+1,r=nums.length-1;

            while(l<r){

                sum=nums[i]+nums[l]+nums[r];
                   // System.out.println(nums[i]+" "+nums[l]+" "+nums[r] + " = "+sum);
                if(sum==0){
                    List<Integer> list=new ArrayList<>();

                    list.add(nums[i]);
                    
                    list.add(nums[l]);
                    list.add(nums[r]);
                   
                    ol.add(list);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    System.out.println(nums[i]+" "+nums[l]+" "+nums[r]+" = "+sum);
                }

                if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }

            
        }
        return ol;
    }
}