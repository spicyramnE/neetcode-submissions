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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathHelper(root);
        return maxSum;
    }


    private int maxPathHelper(TreeNode node){
        if(node==null) return 0;

        // let us try not taking negative paths
        // if left is neg pretend its 0
        int leftMax=Math.max(0,maxPathHelper(node.left));
        int rightMax=Math.max(0,maxPathHelper(node.right));
        // checking through node lrr
        int throughMe=leftMax+node.val+rightMax;
        maxSum=Math.max(maxSum,throughMe);

        return node.val+Math.max(leftMax,rightMax);
    }
}
