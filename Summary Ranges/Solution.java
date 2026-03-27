class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<>();
        int len = nums.length;
        if(len==0){
            return l;
        }else if(len==1){
            l.add(""+nums[0]);
            return l;
        }else{
            int a = nums[0];
            for(int i=1;i<len;i++){
                int prev = nums[i-1];
                if(nums[i]!=prev+1){
                    if(prev!=a){
                        l.add(a + "->" + prev);
                    }else{
                        l.add(""+a);
                    }
                    a = nums[i];
                    if(i==len-1){
                        l.add(""+nums[i]);
                    }
                }else if(i==len-1){
                    l.add(a+"->"+nums[i]);
                }
            }
        }
        return l;
    }
}