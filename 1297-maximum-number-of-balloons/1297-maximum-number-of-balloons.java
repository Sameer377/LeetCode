class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];

        for(int i=0;i<text.length();i++) arr[text.charAt(i)-'a']++; 

        int ans =0;
        while(arr[0]>=1 && arr[1]>=1 && arr[11]>=2 && arr[13]>=1 && arr[14]>=2 ){
            ans++;
            arr[0]-=1;
            arr[1]-=1;
            arr[11]-=2;
            arr[13]-=1;
            arr[14]-=2;

        }

        return ans;
    }
}