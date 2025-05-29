class Solution {
    
    boolean isNum(String s){

        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }

    }

    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(isNum(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{

                if(!stack.isEmpty()){
                    int a = stack.pop();
                    int b = stack.pop();

                    int c=0 ;

                    if(tokens[i].equals("+")){
                        c=a+b;
                    }else if(tokens[i].equals("-")){
                        c=b-a;
                    }else if(tokens[i].equals("*")){
                        c=a*b;
                    }else if(tokens[i].equals("/")){
                        c=b/a;
                    }

                    stack.push(c);
                }

            }

        }

        if(!stack.isEmpty()) return stack.pop();
        else return 0;
    }
}