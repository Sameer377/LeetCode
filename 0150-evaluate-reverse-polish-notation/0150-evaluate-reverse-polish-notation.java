class Solution {

      private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!isOperator(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {

                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();

                    int c = 0;

                    if (tokens[i].equals("+")) {
                        c = a + b;
                    } else if (tokens[i].equals("-")) {
                        c = b - a;
                    } else if (tokens[i].equals("*")) {
                        c = a * b;
                    } else if (tokens[i].equals("/")) {
                        c = b / a;
                    }

                    stack.push(c);
                }

            }

        }

        if (!stack.isEmpty())
            return stack.pop();
        else
            return 0;
    }
}