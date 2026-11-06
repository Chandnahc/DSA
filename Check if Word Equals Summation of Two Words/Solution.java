class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = 0;
        int second = 0;
        int target = 0;
        for(char i:firstWord.toCharArray()){
            first = first*10 + (int)(i-'a');
        }
        for(char i:secondWord.toCharArray()){
            second = second*10 + (int)(i-'a');
        }
        for(char i:targetWord.toCharArray()){
            target = target*10 + (int)(i-'a');
        }
        return (first+second)==target;
    }
}