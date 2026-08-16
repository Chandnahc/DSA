class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr = new int[mat.length][2];
        // int soldierCount = 0;
        // for(int i=0;i<mat[0].length;i++){
        //     if(mat[0][i]==1){
        //         soldierCount++;
        //     }else{
        //         break;
        //     }
        // }
        // int kidx=0;
        // for(int i=0;i<mat.length;i++){
        //     int currentSolCount = 0;
        //     for(int j=0;j<mat[0].length;j++){
        //         if(mat[i][j]==1){
        //             currentSolCount++;
        //         }else{
        //             break;
        //         }
        //     }
        //     if(currentSolCount>=soldierCount){
        //         arr[kidx][0] = i-1;
        //         arr[kidx][1] = soldierCount;
        //         kidx++;
        //     }
        //     soldierCount = currentSolCount;
        // }

        for(int i=0;i<mat.length;i++){
            int solCount = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    solCount++;
                }else{
                    break;
                }
            }
            arr[i][0] = i;
            arr[i][1] = solCount;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = arr[i][0];
        } 
        return res;
    }
}