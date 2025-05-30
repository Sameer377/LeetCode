class Solution {
    public int calPoints(String[] operations) {

        //["5","2","C","D","+"]

        Stack<Integer> stack = new Stack<>();
        int total=0;
        for (String s : operations) {

            switch (s) {
                case "C":
                    if (!stack.isEmpty()) {
                        total-= stack.pop();
                        
                    }

                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        int n = stack.peek();
                        n = n * 2;
                        stack.push(n);
                        total +=n;
                    }

                    break;
                case "+":
                    if (!stack.isEmpty()) {
                        int a = stack.pop();

                        int b = 0;
                        int c = 0;
                        if (!stack.isEmpty()) {
                            b = stack.peek();
                            c = a + b;
                        }
                        stack.push(a);
                        stack.push(c);
                        total+=c;
                    }
                    break;
                default:
                    int t = Integer.parseInt(s);
                    stack.push(t);
                    total+=t;
                    break;
            }
        }

        // int sum = 0;
        // while (!stack.isEmpty()) {
        //     sum += stack.pop();
        // }

        return total;

    }
}