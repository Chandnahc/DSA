class Solution {
    public int subsetXORSum(int[] nums) {
        int n = 1 << nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int curr = 0;
            for(int j=0;j<nums.length;j++){
                if((i & (1 << j)) != 0) {
                    curr = curr ^ nums[j];
                }
            }
            ans += curr;
        }
        return ans;
    }
}