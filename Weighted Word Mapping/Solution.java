class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] ans = new char[words.length];
        for(int i=0;i<words.length;i++){
            int sum = 0;
            for(int j=0;j<words[i].length();j++){
                sum += weights[words[i].charAt(j) - 'a'];
            }
            sum = sum%26;
            ans[i] = (char)('a'+25-sum);
        }
        return String.valueOf(ans);
    }
}