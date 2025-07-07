class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        if (n == 0 || k == 0) return new int[0]; // \U0001f512 edge case check

        int[] result = new int[n - k + 1];         // \U0001f9fa stores final max values
        Deque<Integer> deque = new ArrayDeque<>(); // \U0001fa9c stores indices of useful elements

        for (int i = 0; i < n; i++) {
            // 1️⃣ Remove elements from front if they are out of this window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst(); // ❌ remove index outside window
            }

            // 2️⃣ Remove elements from back if current is greater
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast(); // ❌ remove smaller elements — useless
            }

            // 3️⃣ Add current index to deque
            deque.offerLast(i); // ✅ keep this index for max tracking

            // 4️⃣ Record max for this window (if window is full)
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()]; // \U0001f3af max is always at front
            }
        }

        return result;
    }
}