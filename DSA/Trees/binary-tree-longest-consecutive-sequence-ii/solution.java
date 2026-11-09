class Solution {

    int ans = 0;

    public int longestConsecutive(TreeNode root) {
        dfs(root);
        return ans;
    }

    int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        int inc = 1;
        int dec = 1;

        if (root.left != null) {
            int[] left = dfs(root.left);

            if (root.val == root.left.val + 1) {
                dec = Math.max(dec, left[1] + 1);
            }

            if (root.val == root.left.val - 1) {
                inc = Math.max(inc, left[0] + 1);
            }
        }

        if (root.right != null) {
            int[] right = dfs(root.right);

            if (root.val == root.right.val + 1) {
                dec = Math.max(dec, right[1] + 1);
            }

            if (root.val == root.right.val - 1) {
                inc = Math.max(inc, right[0] + 1);
            }
        }

        ans = Math.max(ans, inc + dec - 1);

        return new int[]{inc, dec};
    }
}