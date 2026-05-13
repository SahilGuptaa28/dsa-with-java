class Solution {
    public TreeNode add(int[] nums,int l,int h){
       if(l>h) return null;
            int mid = (l+h)/2;
          TreeNode root = new TreeNode(nums[mid]);
          root.left = add(nums,l,mid-1);
          root.right = add(nums,mid+1,h);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
    
       return add(nums,0,nums.length-1);
    }
}