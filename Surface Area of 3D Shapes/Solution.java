// class Solution {
//     public int surfaceArea(int[][] grid) {
//         // int xyBase = 0;
//         // int xyTop = 0;
//         // int xzBottom = 0;
//         // int xzTop = 0;
//         // int yzRight = 0;
//         // int yzLeft = 0;
//         int n = grid.length;
//         int surfaceArea = 0;

//         // for(int i=0;i<n;i++){
//         //     int prevX = 0;
//         //     // int prevY = 0;
//         //     for(int j=0;j<n;j++){
//         //         if(grid[i][j]!=0) surfaceArea += 2;
//         //         surfaceArea += Math.abs(prevX - grid[i][j]);
//         //         // + Math.abs(prevY - grid[j][i]);
//         //         prevX = grid[i][j];
//         //         // prevY = grid[j][i];
//         //         // if(j==n-1) surfaceArea += grid[j][i];
//         //         if(i==n-1) surfaceArea += grid[i][j];
//         //     }
//         // }

//         // for(int i=0;i<n;i++){
//         //     // int prevX = 0;
//         //     int prevY = 0;
//         //     for(int j=0;j<n;j++){
//         //         // if(grid[i][j]!=0) surfaceArea += 2;
//         //         surfaceArea += 
//         //         // Math.abs(prevX - grid[i][j]);
//         //         + Math.abs(prevY - grid[j][i]);
//         //         // prevX = grid[i][j];
//         //         prevY = grid[j][i];
//         //         if(j==n-1) surfaceArea += grid[j][i];
//         //         // if(i==n-1) surfaceArea += grid[i][j];
//         //     }
//         // }

//         for(int i=0;i<n;i++){
//             int prevX = 0;
//             int prevY = 0;
//             for(int j=0;j<n;j++){
//                 if(grid[i][j]!=0) surfaceArea += 2;
//                 surfaceArea += 
//                 Math.abs(prevX - grid[i][j])
//                 + Math.abs(prevY - grid[j][i]);
//                 prevX = grid[i][j];
//                 prevY = grid[j][i];
//                 if(j==n-1) surfaceArea += grid[j][i];
//                 if(i==n-1) surfaceArea += grid[i][j];
//                 System.out.println("i :"+i+" j :"+j+" v :"+grid[i][j]+" sa :"+surfaceArea);
//             }
//         }

//         return surfaceArea;
//     }
// }


class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            int rowPrev = 0;
            int colPrev = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area += 2; // top + bottom
                }

                area += Math.abs(grid[i][j] - rowPrev);
                area += Math.abs(grid[j][i] - colPrev);

                rowPrev = grid[i][j];
                colPrev = grid[j][i];
            }

            // add far edge of row and column
            area += rowPrev;
            area += colPrev;
        }

        return area;
    }
}