class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        String str = new String();
        while(!stack.isEmpty()){
            str = stack.pop()+str;
        }

        return str;
    }
}