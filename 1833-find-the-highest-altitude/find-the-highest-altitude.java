class Solution {
    public int largestAltitude(int[] gain) {
     int n=gain.length;
     int maxval=Integer.MIN_VALUE;
     int[] prefix=new int[n+1];
     prefix[0]=0;
     for(int i=1;i<gain.length+1;i++){
        prefix[i]=gain[i-1]+prefix[i-1];

     }  
    for(int i=0;i<prefix.length;i++){
        maxval=Math.max(prefix[i],maxval);
    }
    return maxval;
    }
}