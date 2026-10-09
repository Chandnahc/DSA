class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int ans = 0;
        for(int[] i:rectangles){
            int min = Math.min(i[0],i[1]);
            if(min > maxLen){
                maxLen = min;
                ans = 1;
            }else if(min==maxLen){
                ans++;
            }
        }
        return ans;
    }
}