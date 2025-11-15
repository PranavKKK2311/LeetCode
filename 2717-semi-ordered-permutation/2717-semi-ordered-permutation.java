class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int indexOne = 0, indexN = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) indexOne = i;
            if (nums[i] == n) indexN = i;
        }

        int swaps = indexOne + (n - 1 - indexN);
        if (indexOne > indexN) swaps--; // Adjust if 1 is after n

        return swaps;
    }
}
