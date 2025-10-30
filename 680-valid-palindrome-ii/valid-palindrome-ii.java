class Solution {
    public boolean validPalindrome(String s) {
       return mypalindrome(s,0,s.length()-1,1);
    }
    private boolean mypalindrome(String s,int start,int end,int count){
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
               if(count==0) return false;
               return mypalindrome(s,start+1,end,0) || mypalindrome(s,start,end-1,0) ;
            }
        }
        return true;
    }
}