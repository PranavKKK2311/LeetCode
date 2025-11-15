class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0, maxValueWithIndex = values[0];

        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxValueWithIndex + values[j] - j);
            maxValueWithIndex = Math.max(maxValueWithIndex, values[j] + j);
        }

        return maxScore;
    }
}
