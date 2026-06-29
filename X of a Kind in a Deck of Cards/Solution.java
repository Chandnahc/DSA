class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] arr = new int[10001];
        int gcd = 0;
        for(int i=0;i<deck.length;i++){
            arr[deck[i]]++;
        }
        for(int i=0;i<10001;i++){
            if(arr[i]>0){
                gcd = gcd == 0 ? arr[i] : gcd(gcd,arr[i]);
            }
        }
        return gcd>1;
    }

    private int gcd(int a,int b){
        return b==0 ? a : gcd(b,a%b);
    }
}