class Solution {

 
    private boolean isStrictlyIncreasing(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> remaining = new ArrayList<>();

                for (int k = 0; k < i; k++) {
                    remaining.add(nums[k]);
                }
                for (int k = j + 1; k < nums.length; k++) {
                    remaining.add(nums[k]);
                }

                if (isStrictlyIncreasing(remaining)) {
                    count++;
                }
            }
        }

        return count;
    }
}
