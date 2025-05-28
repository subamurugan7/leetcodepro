class Solution {
    public String simplifyPath(String path) {
    Stack<String> stack=new Stack();
    String[] parts = path.split("/");

    for (String part : parts) {
       if(part.equals("")||part.equals(".")){
        continue;
       }
       else if(part.equals("..")){
        if(!stack.isEmpty()){
           stack.pop();
        }
       }
       else{
        stack.push(part);
       }
    }
    StringBuilder result=new StringBuilder();
    for(String res:stack){
        result.append("/").append(res);
    }
     return result.length()>0?result.toString():"/" ;  
    }
}