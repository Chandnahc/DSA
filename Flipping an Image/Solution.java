class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][n-j-1] == 1){
                    res[i][j] = 0;
                }else{
                    res[i][j] = 1;
                }
            }
        }
        return res;
    }
}