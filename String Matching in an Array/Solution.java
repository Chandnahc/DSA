class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> l = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                if(words[j].indexOf(words[i])!=-1){
                    l.add(words[i]);
                    break;
                }
            }
        }
        return l;
    }
}