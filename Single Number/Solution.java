class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n = nums.length;
        while(i!=n && i!=n-1){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }else{
                i+= 2;
            }
        }
        return nums[i];
    }
}