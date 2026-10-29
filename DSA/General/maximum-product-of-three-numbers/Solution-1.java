class Solution {
    public int maximumProduct(int[] nums) {
        // Your code goes here
        Arrays.sort(nums);
        int n =nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Option 2: Product of the two smallest (negative) numbers and the largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the larger of the two options
        return Math.max(product1, product2);
    }
}
