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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
      preorder(a,root);
      return a;

         
    }
    public void preorder(List<Integer> a,TreeNode root){
        if(root==null)return;
        a.add(root.val);
        preorder(a,root.left);
        preorder(a,root.right);

    }
}