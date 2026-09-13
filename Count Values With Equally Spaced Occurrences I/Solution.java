class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        int max = nums[0];
        for(int i:nums){
            freq[i]++;
            if(i>max) max = i;
        }
        for(int i=1;i<=max;i++){
            if(freq[i]==3){
                int j=0;
                while(nums[j]!=i) j++;
                int k = j+1;
                while(nums[k]!=i) k++;
                int l = k+1;
                while(nums[l]!=i) l++;
                if(k-j == l-k) count++;
            }
        }
        return count;
    }
}