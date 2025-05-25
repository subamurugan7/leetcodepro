import java.util.Stack;

class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums) {
            if(stack.isEmpty() || num>=stack.peek()) {
                 stack.push(num);
            }else{
           
            }
        }

        return stack.size();
    }
}



