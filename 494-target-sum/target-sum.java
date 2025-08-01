class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 1);

        for (int n : nums) {
            Map<Integer, Integer> temp = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                int total = entry.getKey();
                int count = entry.getValue();

                temp.put(total + n, temp.getOrDefault(total + n, 0) + count);
                temp.put(total - n, temp.getOrDefault(total - n, 0) + count);
            }
            counter = temp;
        }

        return counter.getOrDefault(target, 0);        
    }
}