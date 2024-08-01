class Stack {
    private int maxSize;
    private int top;
    private String[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if(top >= maxSize-1) {
            System.out.println("Stack is full. Overflow condition!");
            return;
        }
        stackArray[++top] = value;
    }

    public String pop() {
        if(top < 0) {                                                                                                                                                                                                             
            System.out.println("Stack is empty. Underflow condition!");
            return null;
        }
        return stackArray[top--];
    }

    public void printStack() {
        for(int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }


    String reverseString(String str){
        int l = str.length();
        Stack stack = new Stack(str.length());
       
        for(int i=0;i<l;i++){
            stack.push(str.charAt(i)+"");
        }

        str="";
        for(int i=0;i<l;i++){
            str+=stack.pop();
        }
        return str;
    }

   static boolean balancedParanthesis(String str){
       java.util.Stack<Character> st = new java.util.Stack<>();

       for(char c:st){
        if(c=='('||c=='{'||c=='['){
            st.push(c);
        }else{
            /* if(st.isEmpty()){
                return false;
            } */
            char p = st.peek();
            char k='\0';
            if(c==')'){
                k='(';
            }else if(c==']'){
                k='[';
            }
            else if(c=='}'){
                k='{';
            }

            System.out.println(c+" "+k);

            if(p!=k){
                return false;
            }

            st.pop();

        }
       }

       if(!st.isEmpty()){
        return false;
       }

       return true;
   }

    public static void main(String[] args) {

        System.out.println(balancedParanthesis("({}))"));

    }
}
