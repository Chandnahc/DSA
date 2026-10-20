class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int[] freq = new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int idx=0;
        for(int i=1;i<101;i++){
            if(freq[i]!=0){
                if(i==target){
                    while(freq[i]>0){
                        l.add(idx);
                        idx++;
                        freq[i]--;
                    }
                }else{
                    idx += freq[i];
                }
            }
        }
        return l;
    }
}