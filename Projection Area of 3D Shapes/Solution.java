class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int countXY = 0;
        int countXZ = 0;
        int countYZ = 0;
        for(int i=0;i<n;i++){
            int maxX = 0;
            int maxY = 0;
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    countXY++;
                }
                if(grid[i][j]>maxX) maxX = grid[i][j];
                if(grid[j][i]>maxY) maxY = grid[j][i];
            }
            countXZ += maxX;
            countYZ += maxY;
        }
        return countXY + countXZ + countYZ;
    }
}