class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        if(n == 1 && m == 1) return img;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count = 0;
                int sum = 0;
                for(int a = i-1;a<=i+1;a++){
                    for(int b = j-1;b<=j+1;b++){
                        if(0 <= a && a < m && 0 <= b && b < n){
                            sum += img[a][b];
                            count++;
                        }
                    }
                }
                res[i][j] = sum/count;
            }
        }
        return res;
    }
}