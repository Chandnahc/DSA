class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(row[i]==1 && col[j]==1) count++;
                }
            }
        }
        return count;
        // for(int i=0;i<m;i++){
        //     if(row[i]==1) count++;
        // }
        // int temp = 0;
        // for(int i=0;i<n;i++){
        //     if(col[i]==1) temp++;
        // }
        // return Math.min(temp,count);
    }
}