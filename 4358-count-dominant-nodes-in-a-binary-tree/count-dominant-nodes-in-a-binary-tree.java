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
    int ans;

    public int func(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int l = func(root.left);
        int r = func(root.right);

        if (Math.max(l, r) <= root.val) {
            ans++;
        }

        return Math.max(Math.max(l, r), root.val);
      

    }

    public int countDominantNodes(TreeNode root) {
        ans = 0;
        func(root);
        return ans;
    }

}