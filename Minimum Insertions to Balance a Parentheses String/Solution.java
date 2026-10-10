class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int ans = 0;
        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(ch[i]=='('){
                count++;
            }else{
                int j = i;
                while(j<n && s.charAt(j)==')') j++;
                if((j-i)%2==1){
                    ans += 1;
                    count -= (j-i + 1)/2;
                }else{
                    count -= (j-i)/2;
                }
                if(count < 0){
                    ans += -count;
                    count = 0;
                }
                i=j-1;
            }
        }
        if(count>0){
            ans += 2*count;
        }
        return ans;
    }
}