class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        boolean minValueFlag = false;
        for(int i=0;i<nums.length;i++){
            int a =nums[i];
            if(a==Integer.MIN_VALUE){
                minValueFlag = true;
            }
            if(a>max){
                max2 = max1;
                max1 = max;
                max = a;
            }else if(a<max && a>max1){
                max2 = max1;
                max1 = a;
            }else if(a<max1 && a>max2){
                max2 = a;
            }
        }
        if(minValueFlag){
            if(max1 == Integer.MIN_VALUE){
                return max;
            }else{
                return max2;
            }
        }else{
            return max2 == Integer.MIN_VALUE ? max:max2;
        }
    }
}