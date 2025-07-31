class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int custsat=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                custsat+=customers[i];
            }
        }
        int maxval=0;
        int current=0;
        int left=0;
        for(int right=0;right<minutes;right++){
            if(grumpy[right]==1){
                current+=customers[right];
            }
        }
        maxval=current;
        for(int right=minutes;right<customers.length;right++){
             if(grumpy[right]==1){
                current+=customers[right];
            }
             if(grumpy[left]==1){
                current-=customers[left];
            }
            left++;
            maxval=Math.max(maxval,current);
        }
        return maxval+custsat;
    }
}