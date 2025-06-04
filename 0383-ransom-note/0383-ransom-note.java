class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l=magazine.length();

        for(char c:ransomNote.toCharArray()){

            magazine = magazine.replaceFirst(c+"","");

        }

      
        return ((l-magazine.length())==ransomNote.length());
    }
}