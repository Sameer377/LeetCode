class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(set.contains(value)){
                return false;
            }
            set.add(value);
        }

        return true;
    }
}