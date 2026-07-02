class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[1001];
        int n = nums.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int e = 0;
        int o = 0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                odd[o++] = nums[i];
            }else{
                even[e++] = nums[i];
            }
        }
        e = 0;
        o = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i] = even[e++];
            }else{
                nums[i] = odd[o++];
            }
        }
        return nums;
    }
}