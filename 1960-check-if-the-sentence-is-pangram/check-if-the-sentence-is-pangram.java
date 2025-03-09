class Solution {
    public boolean checkIfPangram(String sentence) {
     if(sentence.length()<26){
        return false;
     }   
     sentence.toLowerCase();
     boolean[] alphabet=new boolean[26];
     int index=0;
     for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        if(ch>='a' && ch<='z'){
           index=ch-'a';
           alphabet[index]=true;
        }
     }
     for(boolean letter:alphabet){
        if(!letter){
            return false;
        }
     }
     return true;
    }
}