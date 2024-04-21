public class ToNum{
    public int myAtoi(String s) {
        if(s==""){
            return 0;
        }
        String str = "";
    
        int first = (int) s.charAt(0);  // get the ASCII
       
    for(char c : s.toCharArray()){
        
        if((int)c>47 &&(int) c<=57  || (int) c==45 ||(int) c==43){
        str=str+c;
        }
        if((int) c == 46){
            break;
        }
    }
    if(str.length()==0){
        return 0;
    }
    long num = Long.parseLong(str);
    if((first!='-'&& first!=' '&&first!='+')&&( first>57 || first<47 )){
        return 0;
    }else if(num>2147483647){
        return 2147483647;
    }else if(num<-2147483648){
        return -2147483648;
    }else {
        return (int)num;
    }
    
    }

    public static void main(String[] args) {
        System.out.println(new ToNum().myAtoi("+-12"));
    }
}