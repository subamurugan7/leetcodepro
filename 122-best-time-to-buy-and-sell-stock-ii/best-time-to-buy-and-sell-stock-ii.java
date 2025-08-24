class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int price : prices) {
            if (!stack.isEmpty()) {
                if (price > stack.peek()) {
                    ans += price - stack.pop();
                } else {
                    stack.pop();
                }
            }
            stack.push(price);
        }
        
        return ans;
    }
}
