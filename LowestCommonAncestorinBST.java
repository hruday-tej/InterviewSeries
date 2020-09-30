/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)return root;
        
        TreeNode r = root;
        
        while(r!=null){
            if(r.val<p.val && r.val<q.val){
                r = r.right;
            }
            else if(r.val>p.val && r.val>q.val){
                r = r.left;
            }
            else{
                return r;
            }
        }
        
        return root;
    }
}
