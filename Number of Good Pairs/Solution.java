class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=1;i<101;i++){
            if(freq[i]>1){
                freq[0] += (freq[i]*(freq[i]-1))/2;
            }
        }
        return freq[0];
    }
}