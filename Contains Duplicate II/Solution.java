class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m =new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(m.containsKey(nums[i])){
                int j = m.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }else{
                    m.put(nums[i],i);
                }
            }else{
                m.put(nums[i],i);
            }
        }
        return false;
    }
}