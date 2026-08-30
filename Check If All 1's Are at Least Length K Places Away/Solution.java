class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastIdx = 0-k-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if((i-lastIdx)<=k) return false;
                lastIdx = i;
            }
        }
        return true;
    }
}