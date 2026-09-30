class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        for(int i=0;i<arr.length;){
            int j=0;
            for(;j<pieces.length;j++){
                if(pieces[j][0]==arr[i]) break;
            }
            if(j==pieces.length) return false;
            else{
                for(int k=0;k<pieces[j].length;k++){
                    if(arr[i+k]!=pieces[j][k]) return false;
                }
                i += pieces[j].length;
            }
        }
        return true;






        // int i = 0;
        // int temp = i;
        // for(int j=0;j<pieces.length;j++){
        //     for(int k=0;k<pieces[j].length;k++){
        //         if(pieces[j][k]==arr[i]){
        //             i++;
        //         }else{
        //             break;
        //         }
        //     }
        //     System.out.println(j+" "+i+" "+temp);
        //     if(i!=temp+pieces[j].length){
        //         if(j==pieces.length-1) return false;
        //         else {
        //             i=temp;
        //             continue;
        //         }
        //     }else{
        //         temp = i;
        //     }
        // }
        // return temp==arr.length;
    }
}