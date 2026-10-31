
class Solution {
    int diameter = 0;

    public int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int firstMax = 0;
        int secondMax = 0;

        for (TreeNode child : node.children) {
            int depth = dfs(child);

            if (depth > firstMax) {
                secondMax = firstMax;
                firstMax = depth;
            } 
            else if (depth > secondMax) {
                secondMax = depth;
            }
        }

        // Longest path passing through this node
        diameter = Math.max(diameter, firstMax + secondMax);

        // Return the maximum depth to the parent
        return firstMax + 1;
    }
}
