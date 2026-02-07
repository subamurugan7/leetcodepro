class Solution {
    public String simplifyPath(String path) {
     Stack<String> st=new Stack<>();
     String[] words=path.split("/");
     for(String word:words){
        if(word.equals("")||word.equals(".")){
            continue;
        }
        else if(word.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else{
          st.push(word);
        }
     }
     StringBuilder sentence=new StringBuilder();
     for(String res:st){
        sentence.append("/").append(res);
     }
     return sentence.length()>0?sentence.toString():"/";
    }
}