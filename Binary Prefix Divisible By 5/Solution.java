class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int currentVal = nums[0];
        List<Boolean> l = new ArrayList<>();
        if(currentVal==0){
            l.add(true);
        }else{
            l.add(false);
        }
        for(int i=1;i<nums.length;i++){
            currentVal = currentVal*2 + nums[i];
            if(currentVal%5==0){
                l.add(true);
            }else{
                l.add(false);
            }
            currentVal = currentVal%5;
        }
        return l;
    }
}