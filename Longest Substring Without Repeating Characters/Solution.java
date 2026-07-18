class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int maxLength = 1;
        int l = 0;
        int i=1;
        while(i<s.length()){
            int temp = s.substring(l,i).indexOf(s.charAt(i));
            if(temp!=-1){
                l += temp+1;
            }
            i++;
            if(maxLength < i-l){
                maxLength = i-l;
            }
            System.out.println(l+" "+i+" "+temp);
        }
        return maxLength;
    }
}