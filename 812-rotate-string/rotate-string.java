class Solution {
    public boolean rotateString(String s, String goal) {
     if(s.length()!=goal.length()){
        return false;
     }  
     String twostring=s+s;
     return twostring.contains(goal);
    }
}