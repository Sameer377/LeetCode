class Solution {
    public int calPoints(String[] operations) {

        //["5","2","C","D","+"]

        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {

            switch (s) {
                case "C":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }

                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        int n = stack.peek();
                        n = n * 2;
                        stack.push(n);
                    }

                    break;
                case "+":
                    if (!stack.isEmpty()) {
                        int a = stack.pop();

                        int b = 0;
                        int c=0;
                        if (!stack.isEmpty()) {
                            b = stack.peek();
                            c = a + b;
                        }
                        stack.push(a);
                        stack.push(c);
                    }
                    break;
                default:
                    stack.push(Integer.parseInt(s));

                    break;
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;

    }
}