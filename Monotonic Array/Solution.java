class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isDecreasing = false;
        boolean isIncreasing = false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]) isIncreasing = true;
            if(nums[i] > nums[i+1]) isDecreasing = true;
            if(isDecreasing && isIncreasing) return false;
        }

        return !(isDecreasing && isIncreasing);

    }
}