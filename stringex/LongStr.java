
public class LongStr {

    public static int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int resl = 0;
        String substr="";
       
            for (int i = 0, j = 1; j <= l; j++) {
                try{

                 substr = s.substring(i, j);
                
                for(int  k=j;k<l;k++){
                    for(int m=i;m<j;m++){
                        if(substr.charAt(m)==substr.charAt(k)){
                            i=m+1;
                            substr=s.substring(i,j);
                            break;
                        }
                    }
                }
            }
            catch(Exception e){
                
            }
              
            }
       

        return substr.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcab"));
    }

}
