class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> s = new HashSet<>();
        for(int i=0;i<words.length;i++){
            char[] temp = words[i].toCharArray();
            StringBuilder sb = new StringBuilder("");
            for(int j=0;j<temp.length;j++){
                sb.append(code[temp[j]-'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}