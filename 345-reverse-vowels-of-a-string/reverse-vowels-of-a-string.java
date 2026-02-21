class Solution {
    public String reverseVowels(String s) {
      char[] result=s.toCharArray();
      int left=0;
      int right=s.length()-1;
      while(left<right){
        while(left<right&&!isvowels(result[left])){
            left++;
        }
        while(left<right&&!isvowels(result[right])){
            right--;
        }
        char temp=result[left];
        result[left]=result[right];
        result[right]=temp;
        left++;
        right--;
      }  
     return new String(result);
    }
    private static boolean isvowels(char character){
        return "aeiouAEIOU".indexOf(character)!=-1;
    }
}