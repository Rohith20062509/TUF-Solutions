class Solution {
    public int rowWithMax1s(int[][] mat) {
        int max = 0;
        int ans = -1;

        for (int i = 0; i < mat.length; i++) {
            int low = 0;
            int high = mat[0].length - 1;
            int first = mat[0].length;

            // Find first occurrence of 1
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (mat[i][mid] == 1) {
                    first = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int count = mat[0].length - first;

            if (count > max) {
                max = count;
                ans = i;
            }
        }

        return ans;
    }
}