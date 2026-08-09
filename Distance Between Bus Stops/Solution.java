class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int between = 0;
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i=0;i<distance.length;i++){
            total += distance[i];
            if(i>=start && i<destination){
                between += distance[i];
            }
        }
        return Math.min(between, total - between);
    }
}