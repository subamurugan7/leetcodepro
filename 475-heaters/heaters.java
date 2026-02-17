class Solution {
    public int findRadius(int[] houses, int[] heaters) {
       int[] ans=new int[houses.length];
       for(int i=0;i<houses.length;i++){
        int minval=Integer.MAX_VALUE;
        for(int j=0;j<heaters.length;j++){
            int val=Math.abs(houses[i]-heaters[j]);
            if(val<minval){
              minval=val;
            }
        }
        ans[i]=minval;
       } 
       int maxval=Integer.MIN_VALUE;
       for(int i=0;i<ans.length;i++){
        if(ans[i]>maxval){
            maxval=ans[i];
        }
       }
       return maxval;
    }
}