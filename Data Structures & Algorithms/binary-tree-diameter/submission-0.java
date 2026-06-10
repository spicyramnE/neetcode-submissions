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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter;
    }
    int getHeight(TreeNode node){
        if (node==null) return 0; 

        int left=getHeight(node.left); 
        //check node left for more child
        int right=getHeight(node.right);
        //check node right for more child
        
        diameter=Math.max(diameter,left+right); 
        return 1+ Math.max(left, right);

    }
}
