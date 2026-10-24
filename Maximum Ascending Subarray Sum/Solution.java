class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int l = 0;
        int r = 0;
        int sum = nums[0];
        while(r<nums.length-1){
            if(nums[r]<nums[r+1]){
                sum += nums[r+1];
                r++;
            }else{
                sum = nums[r+1];
                l = r+1;
                r++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}