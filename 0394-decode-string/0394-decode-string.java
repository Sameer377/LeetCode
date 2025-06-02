class Solution {
    public String decodeString(String s) {

        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // build number for multiple digits
            } else if (c == '[') {
                // Push current state
                strStack.push(curr);
                numStack.push(num);
                curr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                // Pop and build the repeated string
                StringBuilder prev = strStack.pop();
                int repeatTimes = numStack.pop();
                StringBuilder repeated = new StringBuilder();

                for (int i = 0; i < repeatTimes; i++) {
                    repeated.append(curr);
                }

                curr = prev.append(repeated);
            } else {
                // It’s a letter
                curr.append(c);
            }
        }

        return curr.toString();
    }
}
