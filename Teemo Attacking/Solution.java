class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalSec = 0;
        int currentTime = 0;
        int n = timeSeries.length;
        for(int i=0;i<n-1;i++){
            if(timeSeries[i]+duration >= timeSeries[i+1]){
                totalSec += timeSeries[i+1] - timeSeries[i];
            }else{
                totalSec += duration;
            }
        }
        return totalSec+duration;
    }
}