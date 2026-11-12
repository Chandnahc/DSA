class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        if(n==2) return true;
        boolean flag = false;
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                if(flag) return false;
                flag = true;
                if(i!=1){
                    if(nums[i-2]>=nums[i]){
                        nums[i] = nums[i-1];
                    }
                }
            }
        }
        return true;
    }
}