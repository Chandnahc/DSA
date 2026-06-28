class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int current = 0;
        int high = nums.length-1;
        while(low<high && current<=high){
            if(nums[current]%2==0){
                int temp = nums[current];
                nums[current] = nums[low];
                nums[low++] = temp;
            current++;
            }else{
                int temp = nums[current];
                nums[current] = nums[high];
                nums[high--] = temp;
            }
        }

        // if(nums[current]%2==0){
        //     int temp = nums[low];
        //     nums[low] = nums[current];
        //     nums[current] = temp;
        // }

        return nums;
    }
}