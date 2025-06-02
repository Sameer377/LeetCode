class Solution {
    public String decodeString(String s) {

        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String num = "";
        String str = "";
        for (char c : s.toCharArray()) {

            if (c == '[') {
                numStack.push(Integer.parseInt(num));
                num = "";
                strStack.push(c + "");
            } else if (Character.isAlphabetic(c)) {
                strStack.push(c + "");
            } else if (c == ']') {
                while (!strStack.isEmpty() && !strStack.peek().equals("[")) {
                    str = strStack.pop() + str;
                }

                if (!strStack.isEmpty()&& strStack.peek().equals("["))
                    strStack.pop();

                int n = numStack.pop();
                String f = str;
                strStack.push(f.repeat(n));
                str = "";

            } else if (Character.isDigit(c)) {
                num += c;
            }

        }

        String ans = "";

        while (!strStack.isEmpty()) {
            ans = strStack.pop() + ans;
        }

        return ans;
    }
}