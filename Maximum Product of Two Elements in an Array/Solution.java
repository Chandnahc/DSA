class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int secmax = 0;
        for(int i:nums){
            if(i>max){
                secmax = max;
                max = i;
            }else if(i>secmax){
                secmax = i;
            }
        }
        return (max - 1) * (secmax -1);
    }
}