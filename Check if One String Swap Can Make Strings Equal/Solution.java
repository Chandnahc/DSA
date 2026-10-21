class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int a = -1;
        int b = -1;
        if(s1.equals(s2)) return true;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(b!=-1) return false;
                if(a!=-1) b = i;
                else a = i;
            }
        }
        if(b==-1) return false;
        return (s1.charAt(a)==s2.charAt(b)) && (s1.charAt(b)==s2.charAt(a));
    }
}