class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<String,String> m = new HashMap<>();
        Set<String> set = new HashSet<>();
        int l = s.length();
        for(int i=0;i<l;i++){
            String c = String.valueOf(s.charAt(i));
            String c1 = String.valueOf(t.charAt(i));
            if(m.containsKey(c)){
                if(!c1.equals(m.get(c))){
                    return false;
                }
            }else{
                if(set.contains(c1)){
                    return false;
                }else{
                    m.put(c,c1);
                    set.add(c1);
                }
            }
        }
        return true;
    }
}