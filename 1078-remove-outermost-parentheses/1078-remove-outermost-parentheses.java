class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) str.append(c);
                open++;
            } else {
                open--;
                if (open > 0) str.append(c);
            }
        }

        return str.toString();
    }
}
