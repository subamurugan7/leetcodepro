class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
     String[] word=sentence.split(" ");
     int count=0;
     for(int i=0;i<word.length;i++){
        if(word[i].startsWith(searchWord)){
            return count+1;
        }
        count++;
     }
     return -1;
    }
}