class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> m = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            m.computeIfAbsent(nums[i],k->new ArrayList<Integer>()).add(i);
        }

        for(Map.Entry<Integer,List<Integer>> i:m.entrySet()){
            List<Integer> l = i.getValue();
            if(l.size()>=3){
                int diff = l.get(1)-l.get(0);
                int j = 2;
                for(;j<l.size();j++){
                    if(l.get(j)-l.get(j-1) != diff){
                        break;
                    }
                }
                if(j==l.size()){
                    count++;
                }
            }
        }
        return count;
    }
}