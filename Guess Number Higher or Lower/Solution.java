/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid =low + (high-low)/2;
        while(low<mid && mid<high){
            int possibility = guess(mid);
            if(possibility==0){
                return mid;
            }else if(possibility==-1){
                high = mid;
                mid = low + (high-low)/2;
            }else{
                low = mid;
                mid = low + (high-low)/2;
            }
        }
        return guess(mid)==0 ? mid:high;
    }
}