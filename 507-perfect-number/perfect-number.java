class Solution {
    public boolean checkPerfectNumber(int num) {
       int val=0;
       for(int i=1;i<=num/2;i++){
        if(num%i==0){
            val=val+i;
        }
       } 
       return val==num;
    }
}