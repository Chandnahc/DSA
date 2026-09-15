class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if(k>arr.length) return false;
        if(k==arr.length && m!=1) return false;

        int l = 0;
        int h = m-1;
        while(true){
            if(h >= arr.length-1) return false;
            int count = 1;
            int temp = h;
            while(true){
                int start = temp+1;
                if(start+m-1>=arr.length){
                    l = l+1;
                    h = h+1;
                    break;
                }else{
                    boolean flag = true;
                    for(int i=start;i<=start+m-1;i++){
                        if(arr[i]!=arr[l+i-start]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        count++;
                        temp = start+m-1;
                    }else{
                        l = l+1;
                        h = h+1;
                        // temp = h;
                        break;
                    }
                    if(count == k) return true;
                }
            }

        } 
        // return false;
    }
}