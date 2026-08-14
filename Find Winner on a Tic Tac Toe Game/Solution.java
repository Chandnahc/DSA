class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        if(n<=4) return "Pending";
        int[][] arr = new int[3][3];
        boolean aTurn = true;
        int i=0;
        for(;i<n;i++){
            arr[moves[i][0]][moves[i][1]] = aTurn ? 1 : -1;
            if(i>=4){
                if(aTurn){
                    if(checkWin(arr,1)) return "A";
                }else{
                    if(checkWin(arr,-1)) return "B";
                }
            }
            aTurn = !aTurn;
        }
        return i==9 ? "Draw" : "Pending";
    }

    private boolean checkWin(int[][] arr, int x){
        for(int i=0;i<3;i++){
            int j =0;
            for(;j<3;j++){
                if(arr[i][j]!=x) break;
            }
            if(j==3){
                return true;
            }
        }

        for(int i=0;i<3;i++){
            int j =0;
            for(;j<3;j++){
                if(arr[j][i]!=x) break;
            }
            if(j==3){
                return true;
            }
        }

        if(arr[0][0] == x && arr[1][1] == x && arr[2][2] == x) return true;
        if(arr[2][0] == x && arr[1][1] == x && arr[0][2] == x) return true;

        return false;
    }
}