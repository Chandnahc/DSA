class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int ans = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                ans += 1;
                count = 0;
            }
        }
        return ans+count;
    }
}