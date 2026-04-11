class Solution {
    public int minimumDistance(int[] nums) {
        int[] firstIdx = new int[100];
        int[] secondIdx = new int[100];
        for(int i=0;i<100;i++){
            firstIdx[i]=-1;
            secondIdx[i]=-1;
        }
        int minDis = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(secondIdx[nums[i]-1]!=-1){
                int sum = Math.abs(firstIdx[nums[i]-1]-secondIdx[nums[i]-1]) + Math.abs(firstIdx[nums[i]-1]-i) + Math.abs(secondIdx[nums[i]-1]-i);
                if(sum < minDis){
                    minDis = sum;
                }
                int temp = firstIdx[nums[i]-1];
                firstIdx[nums[i]-1] = secondIdx[nums[i]-1];
                secondIdx[nums[i]-1] = i;
            }else{
                if(firstIdx[nums[i]-1]!=-1){
                    secondIdx[nums[i]-1] = i;
                }else{
                    firstIdx[nums[i]-1] = i;
                }
            }
        }
        return minDis == Integer.MAX_VALUE ? -1 : minDis;
    }
}