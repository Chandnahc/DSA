class Solution {
    public int maxNumberOfBalloons(String text) {
        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;

        for(int i=0;i<text.length();i++){
            switch(text.charAt(i)){
                case 'b': {countB++; break;}
                case 'a': {countA++; break;}
                case 'l': {countL++; break;}
                case 'o': {countO++; break;}
                case 'n': {countN++; break;}
                default : break;
            }
        }

        int min = Math.min(countB,Math.min(countA,Math.min(countL,Math.min(countO,countN))));

        if(min == countL || min == countO){
            return min/2;
        }else{
            int min1 = Math.min(countL,countO);
            if(min1/2 >= min){
                return min;
            }else{
                return min1/2;
            }
        }
    }
}