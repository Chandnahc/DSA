class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int lastIndex = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[lastIndex]){
                nums[lastIndex+1] = nums[i];
                lastIndex++;
            }
        }
        return lastIndex+1;
    }
}