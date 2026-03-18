class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(i==0){
                if(l!=1 && nums[i+1]<nums[i]){
                    return i;
                }
            }else if(i==l-1){
                if(nums[i-1]<nums[i]){
                    return i;
                }
            }else if(nums[i-1]<nums[i] && nums[i+1]<nums[i]){
                return i;
            }
        }
        return 0;
    }
}