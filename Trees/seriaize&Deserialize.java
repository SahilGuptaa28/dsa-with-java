// leetcode 297 uses pre-order traversal to serialize and deserialize a binary tree
public class Codec {
    StringBuilder sb;
   int index = 0;
    public void serializeTree(TreeNode node){
     if(node == null){
          sb.append("null,");
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

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String[] values = data.split(",");
       return  deserializeTree(values);
    }
     public TreeNode deserializeTree(String[] values) {
        String val = values[index++];
        if(val.equals("null")){
            return null;
        }
        int value = Integer.parseInt(val);
        TreeNode node = new TreeNode(value);
        node.left = deserializeTree(values);
        node.right = deserializeTree(values);
        return node;
    }

}

