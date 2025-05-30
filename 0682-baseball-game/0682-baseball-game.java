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
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
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