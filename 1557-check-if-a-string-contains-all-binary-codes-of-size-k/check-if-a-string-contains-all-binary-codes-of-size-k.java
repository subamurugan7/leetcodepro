class Solution {
    public boolean hasAllCodes(String s, int k) {
      HashSet<String> set=new HashSet<>();
      for(int i=0;i<s.length()-k+1;i++){
        String word=s.substring(i,i+k);
        set.add(word);
      }  
      return set.size()==Math.pow(2,k);
    }
}