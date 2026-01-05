import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        HashMap<Integer, List<String>> reverseCountMap = new HashMap<>();
        for (String word : countMap.keySet()) {
            int count = countMap.get(word);
            reverseCountMap.computeIfAbsent(count, x -> new ArrayList<>()).add(word);
        }
        List<Integer> frequencies = new ArrayList<>(reverseCountMap.keySet());
        Collections.sort(frequencies, (a, b) -> b - a); 
        List<String> result = new ArrayList<>();
        for (int count : frequencies) {
            List<String> wordsList = reverseCountMap.get(count);
            Collections.sort(wordsList);
            for (String word : wordsList) {
                if (result.size() < k) {
                    result.add(word);
                } else {
                    return result;
                }
            }
        }

        return result;
    }
}
