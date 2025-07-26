class Solution {
    public int maximumLengthSubstring(String s) {
      int maxlength=0;
      int[] scount=new int[26];
      int j=0;
      for(int i=0;i<s.length();i++){
        scount[s.charAt(i)-'a']++;
        while(scount[s.charAt(i)-'a']>2){
            scount[s.charAt(j)-'a']--;
            j++;
        }
         maxlength=Math.max(maxlength,i-j+1);
      } 
      return maxlength; 
    }
}