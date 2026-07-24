class Solution {

    public boolean divisorGame(int n) {

        // if(n == 1)
        //     return false;

        // for(int x = 1; x < n; x++){

        //     if(n % x == 0){

        //         if(!divisorGame(n - x))
        //             return true;
        //     }
        // }

        return n%2==0;
    }
}