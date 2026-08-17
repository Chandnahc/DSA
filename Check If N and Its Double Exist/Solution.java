class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] freq = new int[2002];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+1000]++;
            if(arr[i]==0){
                if(freq[1000]>1) return true;
            }else{
                int twice = 2 * arr[i];
                if(twice>=-1000 && twice<=1000 && freq[twice+1000]!=0) return true;
                if(arr[i]%2==0 && freq[1000 + (arr[i]/2)]!=0) return true;
            }
        }
        return false;
    }
}