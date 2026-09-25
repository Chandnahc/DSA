class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count = 0;
            while(nums[i]!=0){
                count += nums[i]%10;
                nums[i] = nums[i]/10;
            }
            if(count == i) return count;
        }
        return -1;
    }
}