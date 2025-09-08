class Solution {
    public int commonFactors(int a, int b) {
        int smallno;
        if(b>a){
         smallno=a;
        }
        smallno=b;
        int count=0;
        for(int i=1;i<=smallno;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
}