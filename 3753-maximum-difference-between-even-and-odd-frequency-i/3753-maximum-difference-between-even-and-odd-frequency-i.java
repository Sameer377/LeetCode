class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxDiff = Integer.MIN_VALUE;
        boolean found = false;

        for (int oddFreq : map.values()) {
            if (oddFreq % 2 == 1) {
                for (int evenFreq : map.values()) {
                    if (evenFreq % 2 == 0) {
                        int diff = oddFreq - evenFreq;
                        maxDiff = Math.max(maxDiff, diff);
                        found = true;
                    }
                }
            }
        }

        return found ? maxDiff : -1;
    }
}
