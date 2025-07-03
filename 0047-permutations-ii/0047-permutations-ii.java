import java.util.*;

class Solution {

    public void swap(List<Integer> list, int i, int j) {
        int t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }

    public void permute(List<Integer> list, int idx, List<List<Integer>> mainlist) {
        if (idx == list.size()) {
            mainlist.add(new ArrayList<>(list));
            return;
        }

        Set<Integer> seen = new HashSet<>();  

        for (int i = idx; i < list.size(); i++) {
            if (seen.contains(list.get(i))) continue; 
            seen.add(list.get(i));

            swap(list, idx, i);
            permute(list, idx + 1, mainlist);
            swap(list, idx, i); 
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  
        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);

        permute(list, 0, ans);
        return ans;
    }
}