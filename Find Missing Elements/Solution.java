class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] idx = new int[101];
        int minInt = 101;
        int maxInt = 0;
        for(int i=0;i<nums.length;i++){
            idx[nums[i]]++;
            if(nums[i]<minInt){
                minInt = nums[i];
            }
            if(nums[i]>maxInt){
                maxInt = nums[i];
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i=minInt;i<maxInt;i++){
            if(idx[i]==0) l.add(i);
        }
        return l;
    }
}