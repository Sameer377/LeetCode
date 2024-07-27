class ReverseInt {
    public static int reverse(int x) {
    boolean isneg=x<0;
    
    StringBuilder s1 = new StringBuilder(String.valueOf(x));
    if(isneg){
        s1=new StringBuilder(s1.subString(1,s1.lenght()));
        s1.reverse();
        s1=new StringBuilder(new StringBuilder("-").conc    at(s1));
    }else{
        s1.reverse();
    }

    return Integer.parseInt(s1);

    }

    public static void main(String[] args) {
        System.out.println(reverse("123"));
    }
}
