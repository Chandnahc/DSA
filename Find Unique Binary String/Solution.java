class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int max = (int)Math.pow(2,n);
        Set<Integer> s = new HashSet<>();
        for(String i:nums){
            s.add(Integer.valueOf(i,2));
        }
        int j = max-1;
        for(;j>=0;j--){
            if(!s.contains(j)) break;
        }
        String res = Integer.toBinaryString(j);
        if(res.length()!=n){
            int temp = n-res.length();
            for(int k = 0;k<temp;k++){
                res = "0"+res;
            }
        }
        return res;

    }
}