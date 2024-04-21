
public class ReverseInt {
    public static int reverse(int x) {
        
        String str = String.valueOf(x);
        String newstr="";
        boolean isnev=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                isnev=true;
                continue;
            }
            newstr=str.charAt(i)+newstr;
        }
        str=newstr;
        while(str.charAt(0)=='0'){

            str=str.substring(1 );
        }

        if(isnev){
            return Integer.parseInt(String.valueOf(str))*-1;
        }else{
            return Integer.parseInt(String.valueOf(str));
        }
        
    }

    public static void main(String[] args) {

        int num = 12345;
int reversedNum = 0;
while (num!= 0) {
    reversedNum = (reversedNum * 10) + (num % 10);
    num = num / 10;
}
        System.out.println(reversedNum);
    }
}
