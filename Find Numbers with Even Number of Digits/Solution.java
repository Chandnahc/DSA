class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(i>99999){
                count++;
            }else if(i>9999){

            }else if(i>999){
                count++;
            }else if(i>99){

            }else if(i>9){
                count++;
            }
        }
        return count;
    }
}