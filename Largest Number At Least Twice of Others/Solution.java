class Solution {
    public int dominantIndex(int[] nums) {
        int secondMax = -1;
        int max = -1;
        int maxIdx = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
                maxIdx = i;
            }else if(nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        return max >= 2*secondMax ? maxIdx : -1;
    }
}