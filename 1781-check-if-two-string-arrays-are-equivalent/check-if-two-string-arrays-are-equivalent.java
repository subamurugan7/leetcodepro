class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="0";
        for(int i=0;i<word1.length;i++){
             w1=w1+word1[i];
        }
         String w2="0";
        for(int i=0;i<word2.length;i++){
             w2=w2+word2[i];
        }
        return w1.equals(w2);
    }
}