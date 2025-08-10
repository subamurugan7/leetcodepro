class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int removed=0;
        for(int i=0;i<intervals.length;i++){
            int currEnd=intervals[i][1];
            while(i+1<intervals.length&&currEnd>intervals[i+1][0]){
                removed++;
                currEnd=Math.min(currEnd,intervals[i+1][1]);
                i++;
            }
        }
        return removed;
    }
}