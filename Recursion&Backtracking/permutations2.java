class Solution {
     public void permutations(int[] arr, List<List<Integer>> ds, List<Integer> list, boolean[] freq){
        if(list.size() == arr.length){
            ds.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
           if (i > 0 && arr[i] == arr[i - 1] && !freq[i - 1]) {
                continue;
            }
            if(!freq[i]){
                freq[i] = true;
                list.add(arr[i]);
                permutations(arr,ds,list,freq);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>> ds = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutations(nums, ds,list,freq);
        return ds;
    }
}