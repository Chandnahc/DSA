class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n<3) return true;

        if(nums[0] >= nums[n-1]){
            int count = 0;
            int prev = nums[0];
            for(int i:nums){
                if(i<prev) count++;
                prev = i;
                if(count>1) return false;
            }
            return true;
        }else{
            int prev = nums[0];
            for(int i:nums){
                if(i<prev) return false;
                prev = i;
            }
            return true;
        }
    }
}