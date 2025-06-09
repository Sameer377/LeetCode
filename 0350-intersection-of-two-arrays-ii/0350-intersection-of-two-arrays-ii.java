class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int map[] = new int[1001];

        for(int i:nums1) map[i]++;

        int ans[]=new int[nums1.length];
        int j=0;
        for(int i:nums2){
            if(map[i]>0){
                ans[j++]=i;
                map[i]--;
            }
        }

        return Arrays.copyOfRange(ans,0,j);
    }
}