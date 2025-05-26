import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop(); // Match with a '('
            }

            if (stack.isEmpty()) {

                sb.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return sb.toString();
    }
}
