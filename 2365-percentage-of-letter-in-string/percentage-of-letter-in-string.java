class Solution {
    public int percentageLetter(String s, char letter) {
    int count=0;
    for(char ch:s.toCharArray()){
        if(ch==letter){
            count++;
        }
    }  
    double percentage = ((double) count / s.length()) * 100;
    return (int) percentage;
    }
}