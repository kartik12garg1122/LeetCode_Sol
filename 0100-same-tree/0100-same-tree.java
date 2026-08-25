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
    boolean is=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p,q);
        return is;
    }
    boolean check(TreeNode p,TreeNode q){
        if(p==null && q==null)return is;

        if(p==null || q==null){
            is=false;
            return is;
        }

        if(p.val!=q.val){
            is=false;
            return is;
        }

        check(p.left,q.left);
        check(p.right,q.right);

        return is;
    }
}