class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        int ci=0;

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty())
            {
                ci++;
                continue;
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (stack.peek() == '{' && c == '}') {
                stack.pop();
            } else if (stack.peek() == '[' && c == ']') {
                stack.pop();
            } 
        }

       return stack.size()+ci;
    }
}