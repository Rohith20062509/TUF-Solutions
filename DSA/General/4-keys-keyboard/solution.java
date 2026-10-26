
class Solution {
    public int maxA(int n) {
        if (n <= 0) return 0;

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Option 1: Press A
            dp[i] = dp[i - 1] + 1;

            // Option 2: Select, copy, and paste
            for (int j = 1; j <= i - 3; j++) {
                int total = dp[j] * (i - j - 1);
                dp[i] = Math.max(dp[i], total);
            }
        }

        return dp[n];
    }
}
