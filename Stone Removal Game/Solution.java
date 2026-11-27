class Solution {
    public boolean canAliceWin(int n) {
        int currmove = 10;
        boolean aliceMove = true;
        while(n>=currmove){
            n -= currmove;
            currmove--;
            aliceMove = !aliceMove;
        }
        return !aliceMove;
    }
}