public class Codec {
    StringBuilder sb;
    int idx = 0;
    public void serializeTree(TreeNode node){
     if(node == null){
          return;
     }
     sb.append(node.val).append(",");
     serializeTree(node.left);
     serializeTree(node.right);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       sb = new StringBuilder();
       serializeTree(root);
       return sb.toString();
    }
  public TreeNode deserializeTree(String[] values,int min,int max){
     if (idx >= values.length) return null;
     String s = values[idx];
     int val = Integer.parseInt(s);
      if( val <= min ||val >= max) return null;
      idx++;
      TreeNode node = new TreeNode(val); 
     node.left =  deserializeTree(values,min,node.val);
     node.right = deserializeTree(values,node.val,max);
     return node;    
  }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
         String[] values = data.split(",");
     return deserializeTree(values,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
