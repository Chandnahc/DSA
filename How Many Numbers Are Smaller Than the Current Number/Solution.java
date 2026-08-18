class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        // Arrays.fill(freq,-1);
        for(int i:nums){
            freq[i]++;
        }

        int count = 0;
        for(int i=0;i<101;i++){
            if(freq[i]!=0){
                int temp = freq[i];
                freq[i] = count==0 ? -1:count;
                count += temp;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = freq[nums[i]] == -1?0:freq[nums[i]];
        }
        return nums;
    }
}