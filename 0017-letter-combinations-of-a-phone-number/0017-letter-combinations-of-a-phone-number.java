class Solution {

    List<String> mainList = new ArrayList<>();
    public void combine(String digits,int idx,String str,HashMap<Integer,String> map){

        if(idx==digits.length()){
            if(!str.isEmpty())
            mainList.add(str);
            return;
        }

        

        String letters = map.get(digits.charAt(idx)-'0');
        for(char s:letters.toCharArray()){

            str+=s;
            combine(digits,idx+1,str,map);
            str=str.substring(0,str.length()-1);

        }

    }

    public List<String> letterCombinations(String digits) {
        String c="";
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        combine(digits,0,c,map);
        return mainList;
    }
}