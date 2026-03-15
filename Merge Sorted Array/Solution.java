class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLen = m+n;
        int[] result = new int[totalLen];
        int i=0;
        int j=0;
        int l=0;
        while(i<m || j<n){
            if(i==m){
                result[l++] = nums2[j++];
                continue;
            }
            if(j==n){
                result[l++] = nums1[i++];
                continue;
            }
            if(nums1[i]<nums2[j]){
                result[l++] = nums1[i++];
            }else{
                result[l++] = nums2[j++];
            }
        }
        for(int k=0;k<totalLen;k++){
            nums1[k] = result[k];
        }
    }
}