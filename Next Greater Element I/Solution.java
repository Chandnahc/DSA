class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] idxArr = new int[10001];
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];

        for(int i=0;i<n2;i++){
            if(i<n1){
                res[i] = -1;
            }
            idxArr[nums2[i]] = i;
        }
        for(int i=0;i<n1;i++){
            int j = idxArr[nums1[i]];
            while(j<n2){
                if(nums2[j]>nums1[i]){
                    res[i] = nums2[j];
                    break;
                }
                j++;
            }
        }
        return res;
    }
}