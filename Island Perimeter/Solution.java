class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int[][] n = new int[grid.length+2][grid[0].length+2];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                n[i+1][j+1] = grid[i][j];
            }
        }
        for(int i=1;i<=grid.length;i++){
            for(int j=1;j<=grid[0].length;j++){
                if(n[i][j]==1){
                    if(n[i-1][j]==0){
                        perimeter += 1;
                    }
                    if(n[i+1][j]==0){
                        perimeter += 1;
                    }
                    if(n[i][j+1]==0){
                        perimeter += 1;
                    }
                    if(n[i][j-1]==0){
                        perimeter += 1;
                    }
                }
            }
        }
        return perimeter;
    }
}