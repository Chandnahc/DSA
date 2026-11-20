class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        int currPos = 1;
        for(char c:word.toCharArray()){
            int reqPos = (int)(c-'a')+1;
            if(currPos == reqPos) {
                ans++;
                continue;
            }else{
                int temp = 0;
                if(reqPos>currPos){
                    temp = 26 - reqPos + currPos;
                }else{
                    temp = 26 - currPos + reqPos;
                }
                ans += Math.min(Math.abs(reqPos - currPos),temp);
                ans++;
                currPos = reqPos;
            }
        }
        return ans;
    }
}