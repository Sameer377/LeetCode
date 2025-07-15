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


    public boolean isSame(TreeNode root,TreeNode t){

        if(root==null || t==null) return root==t;

        boolean l = isSame(root.left,t.left);
        boolean r = isSame(root.right,t.right);

        return l && r && root.val==t.val;

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null || subRoot == null) return root==subRoot;

        if(root.val==subRoot.val && isSame(root,subRoot)) return true;

        return isSubtree(root.left,subRoot)||
               isSubtree(root.right,subRoot);

    }
}