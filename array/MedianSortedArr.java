

import java.util.ArrayList;

import java.util.Collections;

public class MedianSortedArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i : nums1){
        arr.add(i);
    }
    for(int j:nums2){
        arr.add(j);
    }

    Collections.sort(arr);
    
    boolean isEven = (arr.size()%2==0)?true:false;
    double res = 0.0;
    if(isEven){
        int mid = arr.size()/2;
        res= ((double)arr.get(mid)+(double)arr.get(mid-1))/2;
    }else{
        res = (double)arr.get(arr.size()/2);
    }



    return res;
    }

    public static void main(String[] args) {
    System.out.println(  findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));  
    }
}
