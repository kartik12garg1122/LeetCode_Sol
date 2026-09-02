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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        TreeNode r2=root;
        while(true){
            if(r2.val<val){
                if(r2.right!=null){
                    r2=r2.right;
                }
                else{
                    r2.right=new TreeNode(val);
                    break;
                }
            }
            else{
                if(r2.left!=null){
                    r2=r2.left;
                }
                else{
                    r2.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}