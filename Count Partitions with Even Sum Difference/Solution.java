class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        if(totalSum%2==0){
            return nums.length-1;
        }
        return 0;
    }
}