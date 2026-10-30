class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer>ans=new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            ans.add(nums1[i]);
        } 
        for(int j=0;j<nums2.length;j++){
            ans.add(nums2[j]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}