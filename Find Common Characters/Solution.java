class Solution {
    public List<String> commonChars(String[] words) {
        int[][] freq = new int[words.length][26];
        int[] min = new int[26];
        for(int i=0;i<26;i++){
            min[i] = 101;
        }
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                freq[i][c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<words.length;j++){
                if(freq[j][i]<min[i]){
                    min[i] = freq[j][i];
                }
            }
        }
        List<String> l = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(!(min[i]==101 || min[i]==0)){
                while(min[i]>0){
                    l.add(String.valueOf((char)(i+'a')));
                    min[i]--;
                }
            } 
        }
        return l;
    }
}