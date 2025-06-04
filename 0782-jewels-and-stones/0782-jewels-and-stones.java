class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String res = stones;
        for(char c:jewels.toCharArray()){
            res=res.replace(c+"","");
        }

        return stones.length()-res.length();
    }
}