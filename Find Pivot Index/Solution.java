class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            int temp = totalSum - nums[i];
            if(Math.abs(temp)%2 != 1 && temp/2 == leftSum){
                return i;
            }else{
                leftSum += nums[i];
            }
        }
        return -1;
    }
}