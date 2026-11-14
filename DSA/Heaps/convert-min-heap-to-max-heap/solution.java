class Solution {
    public int[] minToMaxHeap(int[] nums) {
        int n = nums.length;

        // Start from the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        return nums;
    }

    void heapify(int[] nums, int n, int i) {
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        // Swap if parent is not the largest
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(nums, n, largest);
        }
    }
}