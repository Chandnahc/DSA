class Solution {
    public boolean isThree(int n) {
        if(n<4) return false;
        double r = Math.sqrt(n);
        int root = (int) r;
        if(root*root!=n) return false;
        if(n%2==1) {
            return isPrime(root);
        }else{
            return n==4;
        }
    }

    private boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}