class Solution {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sumOfDigits(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

        
    