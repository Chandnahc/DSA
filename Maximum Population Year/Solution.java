class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] freq = new int[101];
        int max = 0;
        for(int[] i:logs){
            for(int j=i[0];j<i[1];j++){
                freq[j-1950]++;
                max = Math.max(freq[j-1950],max);
            }
        }
        for(int i=0;i<101;i++){
            if(freq[i]==max) return i+1950;
        }
        return -1;
    }
}