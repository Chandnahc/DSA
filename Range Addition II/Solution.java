class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int minMaxCount = Integer.MAX_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            int a = ops[i][0];
            int b = ops[i][1];
            if(a<minX){
                minX = a;
            }
            if(b<minY){
                minY = b;
            }
            if(minMaxCount > minX*minY){
                minMaxCount = minX*minY;
            }
        }
        return minMaxCount;
    }
}