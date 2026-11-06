class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = true;
        int n = mat.length;
        //checking for same
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        if(flag) return true;
        flag = true;
        //checking for 90deg rotation
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[j][n-i-1]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        if(flag) return true;
        flag = true;
        //checking for 180deg rotation
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-i-1][n-j-1]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        if(flag) return true;
        flag = true;
        //checking for 270deg rotation
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-j-1][i]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        return flag;
    }
}