class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int totalSum = 0;
        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                int subarrayLength = end - start + 1;
                if (subarrayLength % 2 == 1) { 
                    totalSum += currentSum;
                }
            }
        }
        return totalSum;  
    }
}