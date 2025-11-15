class Solution {
    public long maximumTripletValue(int[] nums) {
        long n = nums.length;
        long maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long tripletValue = (long)(nums[i] - nums[j]) * nums[k];
                    if (tripletValue > maxValue) {
                        maxValue = tripletValue;
                    }
                }
            }
        }
        return maxValue < 0 ? 0 : maxValue;
    }
}