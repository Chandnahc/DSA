class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        Map<String, String> m = new HashMap<>();
        int l = s1.length;
        if(l!=pattern.length()){
            return false;
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<l;i++){
            String str = String.valueOf(pattern.charAt(i));
            if(m.containsKey(str)){
                if(!s1[i].equals(m.get(str))){
                    return false;
                }
            }else{
                if(set.contains(s1[i])){
                    return false;
                }
                set.add(s1[i]);
                m.put(str,s1[i]);
            }
        }
        return true;
    }
}