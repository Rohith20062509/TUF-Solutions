class Solution {
    public List<Integer> removeDuplicates(List<Integer> arr) {
        // Your code goes here
          Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}