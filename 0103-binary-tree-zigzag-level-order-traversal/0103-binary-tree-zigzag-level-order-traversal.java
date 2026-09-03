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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            List<Integer>l1=new ArrayList<>();
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
                TreeNode n=q.remove();
                l1.add(n.val);
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }

                
            }
            if(count%2==0){
                    Collections.reverse(l1);
                }
            ans.add(l1);
        }
        return ans;
    }
}