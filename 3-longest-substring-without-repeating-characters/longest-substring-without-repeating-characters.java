class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>();
        int maxlength=0;
        int start=0;
        int end=0;
        while(end<s.length()){
            char ch=s.charAt(end);
           if(!set.contains(ch)){
                set.add(ch);
                maxlength=Math.max(maxlength,end-start+1);  
                end++;  
           }
           else{
            set.remove(s.charAt(start));
                start++;
           }
        }
        return maxlength;
    }
}