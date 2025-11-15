class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max; 
                max = nums[i]; 
                index = i; 
            } else if (nums[i] > secondMax) {
                secondMax = nums[i]; 
            }
        }
        return max >= 2 * secondMax ? index : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        System.out.println(solution.dominantIndex(nums));
        
        scanner.close();
    }
}


