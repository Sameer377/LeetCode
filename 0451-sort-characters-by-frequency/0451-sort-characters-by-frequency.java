class Solution {
    public String frequencySort(String s) {
        int map[]=new int[62];
        // s=s.toLowerCase();
        for(char c:s.toCharArray()) {
            if(c>='a' && c<='z') map[c-'a']++;
            else if(c>='0' && c<='9'){
                map[c-'0'+52]++;
            }else
            map[c-'A'+26]++;
        }

        StringBuilder str = new StringBuilder();

        while(str.length()<s.length()){

            int m=0;
            int idx=0;
            for(int i=0;i<62;i++){
                if(m<map[i]){
                    m=map[i];
                    idx=i;
                }
            }   

            while(map[idx]-- >0){

                if(idx<26)
                str.append(((char) (idx+'a'))+"");
                else if(idx<52)
 str.append(((char) (idx+'A'-26))+"");
                else
                str.append(((char) (idx+'0'-52))+"");
                
            }

        }

        return str.toString();
    }
}