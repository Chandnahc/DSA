class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int largest = -1;
        for(int i:nums){
            if(i>largest) largest = i;
            freq[i]++;
        }
        int n = nums.length;
        if(k==1){
            for(int i=50;i>=0;i--){
                if(freq[i]==1) return i;
            }
        }

        if(k==n) return largest;


        if(nums[0]>nums[n-1]){
            if(freq[nums[0]]==1) return nums[0];
            else if(freq[nums[n-1]]==1) return nums[n-1];
        }else{
            if(freq[nums[n-1]]==1) return nums[n-1];
            else if(freq[nums[0]]==1) return nums[0];
        }

        return -1;


    }
}