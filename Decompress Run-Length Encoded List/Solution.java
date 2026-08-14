class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            while(nums[i]--!=0){
                l.add(nums[i+1]);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}