
class Solution {
    public int countQuadruples(String firstString, String secondString) {
        int[] first = new int[26];
        int[] second = new int[26];

        java.util.Arrays.fill(first, -1);
        java.util.Arrays.fill(second, -1);

        // Store the first occurrence of each character
        for (int i = 0; i < firstString.length(); i++) {
            int c = firstString.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
        }

        // Store the last occurrence of each character
        for (int i = 0; i < secondString.length(); i++) {
            int c = secondString.charAt(i) - 'a';
            second[c] = i;
        }

        int minDiff = Integer.MAX_VALUE;
        int count = 0;

        for (int c = 0; c < 26; c++) {
            if (first[c] != -1 && second[c] != -1) {
                int diff = first[c] - second[c];

                if (diff < minDiff) {
                    minDiff = diff;
                    count = 1;
                } else if (diff == minDiff) {
                    count++;
                }
            }
        }

        return count;
    }
}
