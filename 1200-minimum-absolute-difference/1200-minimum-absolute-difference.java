class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        
        // Find minimum difference
        for (int i = 1; i < arr.length; i++) {
            minDifference = Math.min(minDifference, arr[i] - arr[i-1]);
        }
        
        // Find all pairs with minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == minDifference) {
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        
        return result;
    }
}
