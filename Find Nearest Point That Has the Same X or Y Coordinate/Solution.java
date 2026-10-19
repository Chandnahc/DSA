class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int minDistIdx = -1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
                int dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if(minDist > dist){
                    minDist = dist;
                    minDistIdx = i;
                }
            }else{
                continue;
            }
        }
        return minDistIdx;
    }
}