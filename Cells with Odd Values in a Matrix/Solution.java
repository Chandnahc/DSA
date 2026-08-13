class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowInc = new int[m];
        int[] colInc = new int[n];
        for(int i=0;i<indices.length;i++){
            rowInc[indices[i][0]]++;
            colInc[indices[i][1]]++;
        }
        int oddCount = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rowInc[i] + colInc[j])%2==1) oddCount++;
            }
        }
        return oddCount;
    }
}