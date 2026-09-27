class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for(int i=0;i<s.length()-1;i++){
            int temp = s.lastIndexOf(s.charAt(i));
            if(temp==-1){
                continue;
            }else{
                max = Math.max(max,temp-i-1);
            }
        }
        return max;
    }
}