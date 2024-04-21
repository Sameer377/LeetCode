public class MergeStringsAlternately {

    public static String mergeString(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        int c = 0;
        while (c < s1.length() || c < s2.length()) {
            if (c < s1.length()) {
                res.append(s1.charAt(c));
            }
            if (c < s2.length()) {
                res.append(s2.charAt(c));
            }
            c++;
        }
        return res + "";
    }

    public static void main(String[] args) {
        System.out.printf(mergeString("sameer", "sha"));
        ;
    }
}
