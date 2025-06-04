class Solution {
    public int longestValidParentheses(String s) {
        int open=0,close=0,max=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }else if(c==')'){
                close++;
            }

            if(open==close){
                max=Math.max(max,close*2);
            }else if(close>open){
                open=0;
                close=0;
            }

        }

        open=0;close=0;

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }else if(c==')'){
                close++;
            }

            if(open==close){
                max=Math.max(max,close*2);
            }else if(close<open){
                open=0;
                close=0;
            }

        }
        
        return max;
    }
}