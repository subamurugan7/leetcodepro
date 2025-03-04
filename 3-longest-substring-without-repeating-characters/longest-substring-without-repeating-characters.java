class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s==null||s.length()==0) return 0;
     int maxlength=0;
     int n=s.length();
     for(int i=0;i<n;i++){
        Set<Character>set=new HashSet<>();
        for(int j=i;j<n;j++){
            if(set.contains(s.charAt(j))){
                break;
            }
            set.add(s.charAt(j));
            maxlength=Math.max(maxlength,j-i+1);
        }
     } 
     return maxlength;  
    }
}