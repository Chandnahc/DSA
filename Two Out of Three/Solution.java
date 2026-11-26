class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] freq = new int[101];
        for(int i:nums1){
            if(freq[i]==0){
                freq[i]=1;
            }
        }
        for(int i:nums2){
            if(freq[i]==0){
                freq[i]=-1;
            }else if(freq[i]==1){
                freq[i]=2;
            }
        }
        for(int i:nums3){
            if(freq[i]==1){
                freq[i]=2;
            }else if(freq[i]==-1){
                freq[i]=-2;
            }
        }
        List<Integer> l = new ArrayList<Integer>();
        for(int i=1;i<101;i++){
            if(freq[i]==2 || freq[i]==-2){
                l.add(i);
            }
        }
        return l;

    }
}