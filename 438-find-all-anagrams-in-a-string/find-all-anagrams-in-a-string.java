class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int k=p.length();
        int h=s.length();
        if(k>h) return ans;
        int[] sarr=new int[26];
        int[] parr=new int[26];
        for(int i=0;i<k;i++){
            sarr[s.charAt(i)-'a']++;
            parr[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(sarr,parr)) ans.add(0);
        for(int i=k;i<h;i++){
            sarr[s.charAt(i)-'a']++;
            sarr[s.charAt(i-k)-'a']--;
            if(Arrays.equals(sarr,parr)){
                 ans.add(i - k + 1);
            }  
        }
        return ans;
    }
}