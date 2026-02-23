class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0;
       int end=0;
       int maxlength=0;
       HashSet<Character> set=new HashSet<>();
       while(end<s.length()){
        char c=s.charAt(end);
        if(set.contains(c)){
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
        }
        set.add(c);
        maxlength=Math.max(maxlength,end-start+1);
        end++;
       } 
       return maxlength;
    }
}