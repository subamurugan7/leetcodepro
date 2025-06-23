class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      ArrayList<String> list=new ArrayList<>();
      HashSet<String> seen=new HashSet<>();
      HashSet<String> repeated=new HashSet<>();
      for(int i=0;i<=s.length()-10;i++){
        String sub=s.substring(i,i+10);
        list.add(sub);
      } 
      for(String sub:list){
        if (seen.contains(sub)) {
                repeated.add(sub);
        } else {
                seen.add(sub);
        }
      }
      return new ArrayList<>(repeated);
    }
}