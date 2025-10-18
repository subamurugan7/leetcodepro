class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int t : tasks)
            freq.put(t, freq.getOrDefault(t, 0) + 1);
        int round = 0;
        for (int count : freq.values()) {
            if (count == 1)
                return -1;
            round += (count + 2) / 3;
        }
        return round;
    }
}