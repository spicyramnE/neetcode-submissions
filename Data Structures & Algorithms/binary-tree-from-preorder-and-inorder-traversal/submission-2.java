/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        
        // Map inorder values to indices for fast lookup
        Map<Integer, Integer> inIdx = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inIdx.put(inorder[i], i);
        }
        
        return build(preorder, 0, inorder, 0, inorder.length - 1, inIdx);
    }
    
    private TreeNode build(int[] preorder, int preStart, int[] inorder, 
                          int inStart, int inEnd, Map<Integer, Integer> inIdx) {
        
        if (inStart > inEnd) return null;
        
        // First element in preorder is the root
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        // Find root position in inorder
        int rootIdx = inIdx.get(rootVal);
        
        // Number of nodes in left subtree
        int leftSize = rootIdx - inStart;
        
        // Build left subtree
        root.left = build(preorder, preStart + 1, inorder, 
                         inStart, rootIdx - 1, inIdx);
        
        // Build right subtree
        root.right = build(preorder, preStart + 1 + leftSize, inorder, 
                          rootIdx + 1, inEnd, inIdx);
        
        return root;
    }
}
    
