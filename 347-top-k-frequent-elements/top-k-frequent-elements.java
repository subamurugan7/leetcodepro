import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build frequency map
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Build reverse map to map frequencies to the list of numbers with that frequency
        HashMap<Integer, List<Integer>> reverseCountMap = new HashMap<>();
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            reverseCountMap.computeIfAbsent(count, x -> new ArrayList<>()).add(num);
        }

        // Step 3: Prepare result array
        int[] res = new int[k];
        int index = 0;

        // Step 4: Loop from the maximum possible frequency down to 1
        for (int i = nums.length; i >= 1; i--) {
            if (reverseCountMap.containsKey(i)) {
                for (int num : reverseCountMap.get(i)) {
                    if (index < k) {
                        res[index++] = num;
                    } else {
                        break;
                    }
                }
            }
            if (index >= k) {
                break;
            }
        }

        return res;
    }
}
