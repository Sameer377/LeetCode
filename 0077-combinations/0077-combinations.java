class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(n,k);
        return result;
    }

    private void dfs(int n,int k){
        if(n==0){
            if(subset.size()==k){
                result.add(new ArrayList<>(subset));
               
            }
             return;
        }

        subset.add(n);
        dfs(n-1,k);
        subset.remove(subset.size()-1);
        dfs(n-1,k);
    }

}   