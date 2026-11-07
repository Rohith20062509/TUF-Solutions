
class Solution {

    public List<String> generateAbbreviations(String word) {
        List<String> result = new ArrayList<>();

        backtrack(word, 0, 0, new StringBuilder(), result);

        return result;
    }

    private void backtrack(String word, int index, int count,
                           StringBuilder sb, List<String> result) {

        if (index == word.length()) {
            int len = sb.length();

            if (count > 0) {
                sb.append(count);
            }

            result.add(sb.toString());

            sb.setLength(len);
            return;
        }

        // Choice 1: Abbreviate current character
        backtrack(word, index + 1, count + 1, sb, result);

        // Choice 2: Keep current character
        int len = sb.length();

        if (count > 0) {
            sb.append(count);
        }

        sb.append(word.charAt(index));

        backtrack(word, index + 1, 0, sb, result);

        // Backtracking: restore StringBuilder
        sb.setLength(len);
    }
}
