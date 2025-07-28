class Solution {
    public boolean isValid(String s) {
         Stack<Character> ch = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                ch.push(curr);
            } else {
                if (ch.isEmpty()) return false;

                char top = ch.peek();
                if ((curr == ')' && top == '(') ||
                    (curr == ']' && top == '[') ||
                    (curr == '}' && top == '{')) {
                    ch.pop();
                } else {
                    return false;
                }
            }
        }

        return ch.isEmpty();
    }
}