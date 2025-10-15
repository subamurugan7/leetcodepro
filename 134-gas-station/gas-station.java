class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int totaltank=0;
     int currenttank=0;
     int start=0;
     for(int i=0;i<gas.length;i++){
        int diff=gas[i]-cost[i];
        totaltank+=diff;
        currenttank+=diff;
        if(currenttank<0){
            start=i+1;
            currenttank=0;
        }
       
     }
      return totaltank>=0?start:-1; 
    }
}