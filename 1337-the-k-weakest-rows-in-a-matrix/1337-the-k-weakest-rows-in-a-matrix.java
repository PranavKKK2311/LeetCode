class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] soldierCount = new int[m];
        for (int i = 0; i < m; i++) {
            soldierCount[i] = countSoldiers(mat[i]);
        }
        Integer[] indices = new Integer[m];
        for (int i = 0; i < m; i++) indices[i] = i;
        
        Arrays.sort(indices, (a, b) -> {
            if (soldierCount[a] != soldierCount[b]) return soldierCount[a] - soldierCount[b];
            return a - b;
        });
        
        return Arrays.stream(indices).limit(k).mapToInt(Integer::intValue).toArray();
    }

    private int countSoldiers(int[] row) {
        int count = 0;
        for (int soldier : row) {
            if (soldier == 1) count++;
            else break;
        }
        return count;
    }
}
