class Solution {
    public String digitSum(String s, int k) {
        int l = s.length();
        if(l<=k) return s;
        StringBuilder sb = new StringBuilder("");

        while(l>k){
            for(int i=0;i<l;){
                int sum = 0;
                int j;
                for(j=i;j<l & j<i+k;j++){
                    sum += (int)(s.charAt(j)-'0');
                }
                i = j;
                sb.append(sum);
            }
            // System.out.println(sb);
            s = sb.toString();
            sb = new StringBuilder("");
            l = s.length();
        }
        return s;
    }
}