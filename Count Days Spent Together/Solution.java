class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceAM = Integer.parseInt(arriveAlice.substring(0,2));
        int aliceAD = Integer.parseInt(arriveAlice.substring(3));
        int aliceLM = Integer.parseInt(leaveAlice.substring(0,2));
        int aliceLD = Integer.parseInt(leaveAlice.substring(3));
        int bobAM = Integer.parseInt(arriveBob.substring(0,2));
        int bobAD = Integer.parseInt(arriveBob.substring(3));
        int bobLM = Integer.parseInt(leaveBob.substring(0,2));
        int bobLD = Integer.parseInt(leaveBob.substring(3));
        int[] prefix = new int[]{31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int aliceA = aliceAM == 1 ? aliceAD : prefix[aliceAM-2]+aliceAD;
        int aliceL = aliceLM == 1 ? aliceLD : prefix[aliceLM-2]+aliceLD;
        int bobA = bobAM == 1 ? bobAD : prefix[bobAM-2]+bobAD;
        int bobL = bobLM == 1 ? bobLD : prefix[bobLM-2]+bobLD;
        if(aliceA < bobA){
            if(aliceL < bobA) return 0;
            else return Math.min(aliceL-bobA, bobL - bobA)+1;
        }else if(aliceA == bobA){
            return Math.min(aliceL - aliceA, bobL - bobA)+1;
        }else{
            if(bobL < aliceA) return 0;
            else return Math.min(bobL - aliceA, aliceL - aliceA)+1;
        }
    }
}