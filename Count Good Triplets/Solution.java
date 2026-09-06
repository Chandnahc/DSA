class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        // for(int i=0;i<arr.length-2;i++){
        //     int j=i+1;
        //     while(j<arr.length-1 && Math.abs(arr[i]-arr[j])>a){
        //         j++;
        //     }
        //     System.out.print(i+" "+j+" ");
        //     if(j==arr.length-1) continue;
        //     int k = j+1;
        //     while(k<arr.length && Math.abs(arr[j]-arr[k])>b){
        //         k++;
        //     }
        //     System.out.println(k+" ");
        //     if(k==arr.length) continue;
        //     if(Math.abs(arr[i]-arr[k])<=c){
        //         System.out.println("--> "+arr[i]+" "+arr[j]+" "+arr[k]);
        //         count++;
        //     }
        // }
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((Math.abs(arr[i]-arr[j])<=a) && (Math.abs(arr[j]-arr[k])<=b) && (Math.abs(arr[i]-arr[k])<=c)) count++;
                }
            }
        }
        return count;
    }
}