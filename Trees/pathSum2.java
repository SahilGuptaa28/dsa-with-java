class Solution {
     private void sum(TreeNode node, int targetSum,int currSum,List<List<Integer>> result,List<Integer> list) {
        if (node == null){
            return ;
        }  
             currSum += node.val;
            list.add(node.val);
          if(node.left== null && node.right == null){
            if(currSum == targetSum){
                result.add(new ArrayList<>(list));
            }
              list.remove(list.size()-1);
            return;
          }
          sum(node.left,targetSum,currSum,result,list);
          sum(node.right,targetSum,currSum,result,list);
            list.remove(list.size()-1);   
        return ;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sum(root,targetSum,0,result,list);
        return result;
    }
}