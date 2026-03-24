class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(s.contains(nums[i])){
                return true;
            }else{
                s.add(nums[i]);
            }
        }
        return false;
    }
}