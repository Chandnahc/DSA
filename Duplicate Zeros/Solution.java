class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temparr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j==arr.length) break;
            if(arr[i]==0){
                temparr[j]=0;
                if(j==arr.length-1) break;
                temparr[++j]=0;
                j++;
            }else{
                temparr[j++] = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temparr[i];
        }
    }
}