class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i:nums){
            max = Math.max(i,max);
        }
        int ans = 0;
        for(int i:nums){
            ans += max - i;
        }
        return ans;
    }
}