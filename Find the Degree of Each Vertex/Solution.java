class Solution {
    public int[] findDegrees(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int count = 0;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==1) count++;
            }
            matrix[0][i] = count;
        }
        return matrix[0];
    }
}