class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int prev = nums[0];
        int ans = 0;
        for(int i=1;i<n;i++){
            if(nums[i]>prev){
                prev = nums[i];
            }else{
                ans += prev+1-nums[i];
                prev++;
            }
        }
        return ans;
    }
}