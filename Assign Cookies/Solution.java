class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g1 = g.length-1;
        int s1 = s.length-1;
        int contentCount = 0;
        while(s1>=0 && g1>=0){
            if(s[s1]>=g[g1]){
                contentCount++;
                s1--;
                g1--;
            }else{
                g1--;
            }
        }
        return contentCount;
    }
}