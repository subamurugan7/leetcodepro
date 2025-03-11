class Solution {
    public int largestAltitude(int[] gain){
       int high=0; 
       int start=0;
       for(int i=0;i<gain.length;i++){
        start+=gain[i];
        high=Math.max(start,high);
       } 
       return high;
    }
}