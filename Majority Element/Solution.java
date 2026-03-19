class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int currentMaj = nums[0];
        int majCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==currentMaj){
                majCount++;
                if(majCount>(nums.length/2)){
                    return currentMaj;
                }
            }else{
                currentMaj = nums[i];
                majCount = 1;
            }
        }
        return currentMaj;
    }
}