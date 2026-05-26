class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int startIdx = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                if(i-startIdx+1 > maxLength){
                    maxLength = i-startIdx+1;
                }
            }else{
                startIdx = i;
            }
        }
        return maxLength;
    }
}