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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //create list of list of integers which is in an array form
        List<List<Integer>> result =new ArrayList<>();
        if(root==null) return result;
        // create a queue of treenodes for processing 
        Queue<TreeNode> queue =new LinkedList<>();
        //add root to egin the queue yes
        queue.offer(root);
        //run till its empty and then get the size to run a loop
        while (!queue.isEmpty()){
            int size=queue.size();
            //the integer's list we will push into result
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++){
                //add value of queue to node
                TreeNode node=queue.poll();
                level.add(node.val);
                //check the left and right of polled node
                if(node.left != null) queue.offer(node.left);
                if (node.right !=null) queue.offer(node.right);
            }
            //add it to the list above 
            result.add(level);
        }
        //print it
        return result;
    }
}
