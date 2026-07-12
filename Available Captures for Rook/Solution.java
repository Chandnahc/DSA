class Solution {
    public int numRookCaptures(char[][] board) {
        int x = -1;
        int y = -1;
        
        for(int i=0;i<8;i++){
            for(int j = 0;j<8;j++){
                if(board[i][j]=='R'){
                    x = i;
                    y = j;
                    break;
                }
            }
            if(x!=-1 || y!=-1) break;
        }

        int count = 0;
        int up = x-1;
        int down = x+1;
        int left = y-1;
        int right = y+1;
        while(up>=0){
            if(board[up][y]!='.'){
                if(board[up][y]=='p') count++;
                break;
            }
            up--;
        }
        while(left>=0){
            if(board[x][left]!='.'){
                if(board[x][left]=='p') count++;
                break;
            }
            left--;
        }
        while(down<8){
            if(board[down][y]!='.'){
                if(board[down][y]=='p') count++;
                break;
            }
            down++;
        }
        while(right<8){
            if(board[x][right]!='.'){
                if(board[x][right]=='p') count++;
                break;
            }
            right++;
        }
        return count;
    }
}