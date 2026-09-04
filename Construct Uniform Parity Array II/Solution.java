class Solution {
    public boolean uniformArray(int[] nums1) {
        int odds = 0;
        int evens = 0;
        int min = nums1[0];
        for(int i:nums1){
            if(i<min) min = i;
            if(i%2==0) evens++;
            else odds++;
        }
        int n = nums1.length;
        if(odds==n || evens==n) return true;
        if(min%2==0) return false;
        else return true;

    }
}