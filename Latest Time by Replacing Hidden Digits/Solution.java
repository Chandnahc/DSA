class Solution {
    public String maximumTime(String time) {
        char[] c = time.toCharArray();
        if(c[1]=='?' || c[1]=='0' || c[1]=='1' || c[1]=='2' || c[1]=='3') c[0] = c[0]=='?' ? '2': c[0];
        else c[0] = c[0]=='?' ? '1': c[0];
        c[1] = c[1]=='?' ? c[0]=='2' ? '3' : '9' : c[1];
        c[3] = c[3]=='?' ? '5': c[3];
        c[4] = c[4]=='?' ? '9': c[4];
        return new String(c);
    }
}