class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=find(n);
        while(fast!=1&&fast!=slow){
            slow=find(slow);
            fast=find(find(fast));
        }
        return fast==1;   
    }
     private static int find(int n){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
           return sum;
        }
}