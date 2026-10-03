class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        for(char c:allowed.toCharArray()){
            s.add(c);
        }
        int counter = 0;
        for(int i=0;i<words.length;i++){
            counter++;
            for(char c:words[i].toCharArray()){
                if(!s.contains(c)){
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }
}