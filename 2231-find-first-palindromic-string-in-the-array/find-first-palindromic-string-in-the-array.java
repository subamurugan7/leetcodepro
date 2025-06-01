class Solution {
    public String firstPalindrome(String[] words) {
    for(int i=0;i<words.length;i++){
        if(ispalindrome(words[i])){
            return words[i];
        }
    }
    return "";
    }
    private boolean ispalindrome(String word){
          int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}