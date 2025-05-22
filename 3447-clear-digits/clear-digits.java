class Solution {
    public String clearDigits(String s) {
      Stack<Character> result=new Stack<>();
      for(char ch:s.toCharArray()){
        if(Character.isLetter(ch)){
            result.push(ch);
        }else if(Character.isDigit(ch)&&!result.isEmpty()){
            result.pop();
        }
      } 
      StringBuilder sb=new StringBuilder();
      for (char ch : result) {
            sb.append(ch);
        }

        return sb.toString();
    }
}