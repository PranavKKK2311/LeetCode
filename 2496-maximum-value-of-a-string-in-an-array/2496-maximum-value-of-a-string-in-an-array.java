class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;
        for (String str : strs) {
            if (str.chars().allMatch(Character::isDigit)) {
                maxValue = Math.max(maxValue, Integer.parseInt(str));
            } else {
                maxValue = Math.max(maxValue, str.length());
            }
        }
        return maxValue;
    }
}
