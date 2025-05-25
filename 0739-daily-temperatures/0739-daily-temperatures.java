class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        
        int n = temperature.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        Arrays.fill(res,0);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperature[i]>temperature[stack.peek()]){
                int id = stack.pop();
                if(temperature[i]-temperature[id]>0)
                res[id] = i-id;
                
            }

            stack.push(i);
        }

       // for(int i:res) System.out.print(i+" ");

        return res;
    }
}