class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int countB = 0, countW = 0;
                for (int x = i; x < i + 2; x++) {
                    for (int y = j; y < j + 2; y++) {
                        if (grid[x][y] == 'B') countB++;
                        else countW++;
                    }
                }
                if (countB >= 3 || countW >= 3) return true;
            }
        }
        return false;
    }
}

        
    