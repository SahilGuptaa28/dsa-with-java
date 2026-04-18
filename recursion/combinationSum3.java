class Solution {
     public void findCombination(int k,int idx,int target,List<List<Integer>> ans, List<Integer> ds){
        if(ds.size() == k){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
         if (idx > 9) {
            return;
        }
        if(idx<=target){
            ds.add(idx);
            findCombination(k,idx+1,target-idx,ans,ds);
            ds.remove(ds.size()-1);
        }
         findCombination(k,idx+1,target,ans,ds);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans = new ArrayList<>(); 
           List<Integer> ds = new ArrayList<>();  
        findCombination(k,1,n, ans, ds);  
        return ans;
    }
}