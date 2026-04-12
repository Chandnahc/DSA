class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,Integer> firstIdx = new HashMap<>();
        Map<Integer,Integer> secondIdx = new HashMap<>();
        int minDis = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(secondIdx.containsKey(nums[i])){
                int value = secondIdx.get(nums[i]);
                int dis = value - firstIdx.get(nums[i]) + i-value + i - firstIdx.get(nums[i]);
                if(dis<minDis){
                    minDis = dis;
                }
                firstIdx.put(nums[i],value);
                secondIdx.put(nums[i],i);
            }else{
                if(firstIdx.containsKey(nums[i])){
                    secondIdx.put(nums[i],i);
                }else{
                    firstIdx.put(nums[i],i);
                }
            }
        }
        return minDis == Integer.MAX_VALUE ? -1 : minDis;
    }
}