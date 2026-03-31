/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)){
            return 1;
        }
        int low = 1;
        int high = n;
        int mid = low + (n-1)/2;
        while(low!=mid){
            if(isBadVersion(mid)){
                high = mid;
                mid = low + (high-low)/2;
            }else{
                low = mid;
                mid = low + (high-low)/2;
            }
        }
        return low+1;
    }
}