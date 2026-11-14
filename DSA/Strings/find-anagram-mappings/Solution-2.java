import java.util.*;

class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {

        HashMap<Integer, Queue<Integer>> map = new HashMap<>();

        // Store indices of each element
        for (int i = 0; i < nums2.length; i++) {
            map.putIfAbsent(nums2[i], new LinkedList<>());
            map.get(nums2[i]).add(i);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]).poll();
        }

        return ans;
    }
}