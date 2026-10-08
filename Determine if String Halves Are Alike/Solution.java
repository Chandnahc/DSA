class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                if(i < s.length()/2) count++;
                else count--;
            }
        }
        return count==0;
    }
}