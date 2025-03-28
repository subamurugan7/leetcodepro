class Solution {
    public int largestInteger(int num) {
      char[] digits = String.valueOf(num).toCharArray();
        
        List<Character> oddList = new ArrayList<>();
        List<Character> evenList = new ArrayList<>();
        
       
        for (char digit : digits) {
            if ((digit - '0') % 2 == 0) {
                evenList.add(digit);
            } else {
                oddList.add(digit);
            }
        }
        
     
        oddList.sort(Collections.reverseOrder());
        evenList.sort(Collections.reverseOrder());
        
        
        int oddIndex = 0, evenIndex = 0;
        for (int i = 0; i < digits.length; i++) {
            if ((digits[i] - '0') % 2 == 0) {
                digits[i] = evenList.get(evenIndex++);
            } else {
                digits[i] = oddList.get(oddIndex++);
            }
        }
                return Integer.parseInt(new String(digits));
    
    }
}