

class Solution {
    
    public int sumRootToLeaf(TreeNode root) {
        return sumRec(root, "");      
    }
    
    private int sumRec(TreeNode node, String val) {
        
        if (node == null) {
            return 0; 
        }
        else if (node.left == null && node.right == null) {
            return Integer.parseInt(val + convertInts(node.val), 2);
        }
        else {
            val = val + convertInts(node.val);
            return sumRec(node.left, val) + sumRec(node.right, val);    
        }
        
    }
    
    private char convertInts(int biNum) { // assumes val is equal to either 0 or 1
        if (biNum == 1) {
            return '1';
        }
        else {
            return '0';
        }
    }
    
}