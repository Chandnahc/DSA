class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        StringBuilder sb = new StringBuilder("");
        for(char c:s.toCharArray()){
            sb.append((int)(c-'a')+1);
        }
        if(k==0) Integer.valueOf(sb.toString());
        int sum=0;
        for(char c:sb.toString().toCharArray()) sum += (int)(c-'0');
        k--;
        int n=sum;
        while(k>0){
            sum=0;
            while(n!=0){
                sum += n%10;
                n /= 10;
            }
            if(sum<10) break;
            k--;
            n=sum;
        }
        return sum;
    }
}