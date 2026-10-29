
class Solution {
    public String boldWords(String[] words, String s) {
        int n = s.length();
        boolean[] bold = new boolean[n];

        // Mark all characters belonging to any keyword
        for (String word : words) {
            int len = word.length();

            for (int i = 0; i <= n - len; i++) {
                if (s.startsWith(word, i)) {
                    for (int j = i; j < i + len; j++) {
                        bold[j] = true;
                    }
                }
            }
        }

        // Construct the result, merging adjacent bold characters
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (bold[i] && (i == 0 || !bold[i - 1])) {
                result.append("<b>");
            }

            result.append(s.charAt(i));

            if (bold[i] && (i == n - 1 || !bold[i + 1])) {
                result.append("</b>");
            }
        }

        return result.toString();
    }
}
