class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String answer = "";
        for (String word : dictionary) {
            if (isSubsequence(s, word)) {
                if (word.length() > answer.length() ||
                   (word.length() == answer.length() && word.compareTo(answer) < 0)) {
                    answer = word;
                }
            }
        }

        return answer;
    }
    private boolean isSubsequence(String s, String word) {

        int i = 0, j = 0;

        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;   
            }
            i++;       
        }

        return j == word.length();
    }
}
