class Solution {
    public String decodeString(String s) {
      Stack<Integer> countstack=new Stack<>();
      Stack<StringBuilder> stringstack=new Stack<>();
      StringBuilder curr=new StringBuilder();
      int num=0;
      for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
            num=num*10+(ch-'0');
        }
        else if(ch=='['){
            countstack.push(num);
            stringstack.push(curr);
            num=0;
            curr=new StringBuilder();
        }
        else if(ch==']'){
            int rep=countstack.pop();
            StringBuilder str=stringstack.pop();
            for(int i=0;i<rep;i++){
               str.append(curr);
            }
            curr=str;
        }
        else{
            curr.append(ch);
        }
      }  
      return curr.toString();
    }
}