class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n>24){
            return 8 + 16 + 24 + (n-24)*4;
        }else if(n<=24 && n>16){
            return 8 + 16 + (n-16)*3;
        }else if(n<=16 && n>8){
            return 8 + (n-8)*2;
        }else{
            return n;
        }
        
        // return word.length()<=8 ? word.length() : ;
    }
}