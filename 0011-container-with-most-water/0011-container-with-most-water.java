class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int i=0,j=n-1;
        int maxW=0;
        while(i<j){

           int max = Math.min(height[i],height[j]) * (j-i);
           maxW=Math.max(maxW,max); 

           if(height[i]<height[j]){
            i++;
           }else{
            j--;
           } 
        }

        return maxW;
    }
}