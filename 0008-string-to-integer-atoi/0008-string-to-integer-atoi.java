class Solution {
    public int myAtoi(String s) {
        
        int sign=1;
        int i=0;
        String num="";

        s=s.trim();

        if(s.isEmpty()) return 0;

        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sign=-1;
                
            }
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num+=s.charAt(i);
            i++;
        }


        if(num.isEmpty()) return 0;

        try{
            return Integer.parseInt(num) * sign;
        }catch(NumberFormatException e){
            return (sign==1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
        }    
    }
}