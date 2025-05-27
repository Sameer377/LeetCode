class Solution {
    public boolean isAnagram(String s, String t) {
        
        int arr1[] = new int[130];
        int arr2[] = new int[130];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)] = arr1[s.charAt(i)]+1;
            arr2[t.charAt(i)] = arr2[t.charAt(i)]+1;
        }

        return Arrays.equals(arr1,arr2);
    }
}