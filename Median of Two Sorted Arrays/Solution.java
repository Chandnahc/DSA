class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        int totalLength = nums1.length + nums2.length;
        int[] mergedArray = new int[totalLength];
        for(int i=0;i<totalLength;i++){
            if(x==nums1.length){
                mergedArray[i]=nums2[y];
                y++;
                continue;
            }
            if(y==nums2.length){
                mergedArray[i]=nums1[x];
                x++;
                continue;
            }
            if(nums1[x]<=nums2[y]){
                mergedArray[i]=nums1[x];
                x++;
            }else{
                mergedArray[i]=nums2[y];
                y++;
            }
        }
        if(totalLength%2==1){
            return mergedArray[totalLength/2];
        }else{
            double d = (double)(mergedArray[totalLength/2]+mergedArray[(totalLength/2)-1])/2;
            return d;
        }
        
    }
}