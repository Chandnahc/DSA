class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int isPeek = 0;
        int isEnd = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return false;
            if(arr[i]<arr[i+1]){
                if(isEnd == -1) return false;
                else isEnd = 1;
                isPeek = i+1;
                if(isPeek == arr.length-1) return false;
            }else{
                if(isEnd == 1 && isPeek != i) return false;
                else isEnd = -1;
                if(isPeek == 0){return false;}
            }
        }
        return true;
    }
}