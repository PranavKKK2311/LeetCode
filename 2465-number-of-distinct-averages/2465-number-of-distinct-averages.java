class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> averages = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            averages.add(avg);
        }
        return averages.size();
    }
}
