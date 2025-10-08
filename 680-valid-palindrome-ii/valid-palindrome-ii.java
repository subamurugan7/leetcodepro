class Solution {
    public boolean validPalindrome(String s) {
        return myvalidPalindrome(s,0,s.length()-1,1);
    }
    private boolean myvalidPalindrome(String s,int start,int end,int delete){
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
               if(delete==0) return false;
               return myvalidPalindrome(s,start+1,end,0)||myvalidPalindrome(s,start,end-1,0);
            }
        }
        return true;
    }
}