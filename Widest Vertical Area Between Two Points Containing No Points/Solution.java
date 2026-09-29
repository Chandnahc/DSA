class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arrOfX = new int[points.length];
        for(int i=0;i<arrOfX.length;i++){
            arrOfX[i] = points[i][0];
        }
        Arrays.sort(arrOfX);
        int max = 0;
        for(int i=1;i<arrOfX.length;i++){
            if(arrOfX[i]-arrOfX[i-1] > max) max = arrOfX[i] - arrOfX[i-1];
        }
        return max;
    }
}