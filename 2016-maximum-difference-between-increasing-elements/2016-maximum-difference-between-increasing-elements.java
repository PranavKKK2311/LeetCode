class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE, maxDiff = -1;
        for (int num : nums) {
            if (num > min) {
                maxDiff = Math.max(maxDiff, num - min);
            } else {
                min = num;
            }
        }
        return maxDiff;
    }
}
