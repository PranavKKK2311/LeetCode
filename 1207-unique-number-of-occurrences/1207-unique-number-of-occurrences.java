class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int number : arr) countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        HashSet<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return occurrenceSet.size() == countMap.size();
    }
}
