class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        double minAverage = Double.MAX_VALUE;
        int i=0,j=nums.length-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            minAverage = Math.min(minAverage, avg);
            i++;
            j--;
        }
        
        return minAverage;
    }
}