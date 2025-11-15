class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int m = matrix.length, n = matrix[0].length;
        int[][] answer = new int[m][n];
        
        for (int i = 0; i < m; i++) System.arraycopy(matrix[i], 0, answer[i], 0, n);

        for (int j = 0; j < n; j++) {
            int maxInColumn = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) if (matrix[i][j] != -1) maxInColumn = Math.max(maxInColumn, matrix[i][j]);
            for (int i = 0; i < m; i++) if (answer[i][j] == -1) answer[i][j] = maxInColumn;
        }

        return answer;
    }
}

 