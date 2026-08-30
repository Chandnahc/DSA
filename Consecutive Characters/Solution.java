class Solution {
    public int maxPower(String s) {
        int max = 1;
        int start = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if((i-start+1)>max) max = i-start+1;
            }else{
                start = i;
            }
        }
        return max;
    }
}