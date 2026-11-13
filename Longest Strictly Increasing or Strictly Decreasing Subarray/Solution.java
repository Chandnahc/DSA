class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n<2) return n;
        int incL = 0;
        int incR = 1;
        int decL = 0;
        int decR = 1;
        int max = 1;
        while(incR<n){
            if(nums[incR]>nums[incR-1]){
                max = Math.max(max,incR-incL+1);                
            }else{
                incL = incR;
            }
            incR++;
        }
        while(decR<n){
            if(nums[decR]<nums[decR-1]){
                max = Math.max(max,decR-decL+1);                
            }else{
                decL = decR;
            }
            decR++;
        }
        return max;
    }
}