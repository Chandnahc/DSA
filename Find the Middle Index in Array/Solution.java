class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        for(int i=0;i<n;i++){
            if((prefix[i]-nums[i])*2 == (prefix[n-1]-nums[i])) return i;
        }
        return -1;
    }
}