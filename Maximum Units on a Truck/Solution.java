class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int max = 0;
        for(int i=0;i<boxTypes.length;i++){
            int min = Math.min(truckSize,boxTypes[i][0]);
            truckSize -= min;
            max += min*boxTypes[i][1];
            if(truckSize==0) break;
        }
        return max;
    }
}