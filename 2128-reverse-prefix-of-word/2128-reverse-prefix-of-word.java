class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch);
        char arr[]=word.toCharArray();

        for(int i=0,j=index;i<j;i++,j--){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
        }

        return new String(arr);

    }
}