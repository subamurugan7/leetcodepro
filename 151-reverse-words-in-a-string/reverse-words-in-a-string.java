class Solution {
    public String reverseWords(String s) {
     s=s.trim();
     StringBuilder str=new StringBuilder();
     String[] word=s.split("\\s+");
     for(int i=word.length-1;i>=0;i--){
        str.append(word[i]);
        if(i>0){
            str.append(" ");
        }
     }  
     return str.toString();
    }
}