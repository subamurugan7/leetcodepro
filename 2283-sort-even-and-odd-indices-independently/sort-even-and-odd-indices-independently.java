class Solution {
    public int[] sortEvenOdd(int[] nums) {
     int n = nums.length;
        
        for (int pass = 0; pass < n; pass++) {
            for (int i = 0; i + 2 < n; i += 2) {
                if (nums[i] > nums[i + 2]) {
                    swap(nums, i, i + 2);
                }
            }
        }

        
        for (int pass = 0; pass < n; pass++) {
            for (int i = 1; i + 2 < n; i += 2) {
                if (nums[i] < nums[i + 2]) {
                    swap(nums, i, i + 2);
                }
            }
        }

        return nums;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}