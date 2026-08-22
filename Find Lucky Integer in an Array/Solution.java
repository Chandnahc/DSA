class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i:arr){
            freq[i]++;
        }
        int max = -1;
        for(int i=1;i<501;i++){
            if(freq[i]==i){
                max = i;
            }
        }
        return max;
    }
}