class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];
        int r = k%m;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    if(j>=r){
                        res[i][j-r] = mat[i][j];
                    }else{
                        res[i][m-r+j] = mat[i][j];
                    }
                }
            }else{
                for(int j=0;j<m;j++){
                    if((m-j)>r){
                        res[i][j+r] = mat[i][j];
                    }else{
                        res[i][r-m+j] = mat[i][j];
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(res[i][j]!=mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}