class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int currMax = nums[n-1];
        for(int i=n-1;i>=0;i--){
            if(nums[i]<currMax) ans  = Math.max(ans,currMax-nums[i]);
            else currMax = nums[i];
        }
        return ans;
    }
}