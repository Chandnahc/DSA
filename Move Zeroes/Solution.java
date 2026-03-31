class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int lastZero = 0;
        while(true){
            if(i==nums.length){
                break;
            }
            if(nums[i]!=0){
                if(nums[lastZero]==0){
                    nums[lastZero++] = nums[i];
                    nums[i++]=0;
                }else{
                    i++;
                }
            }else if(nums[lastZero]!=0){
                lastZero = i;
                i++;
            }else{
                i++;
            }
        }
    }
}