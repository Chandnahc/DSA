class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int mid = low + (high - low)/2;
        while(low<mid){
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                low = mid;
                mid = low + (high-low)/2;
            }else{
                high = mid;
                mid = low + (high-low)/2;
            }
        }
        return nums[high]==target ? high : nums[mid] ==target ? mid : -1;
    }
}