class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        int l1 = nums1.length;
        int l2 = nums2.length;
        int index = 0;
        int[] res = new int[l1>l2 ? l2:l1];
        for(int i=0;i<l1;i++){
            freq[nums1[i]]++;
        }
        for(int i=0;i<l2;i++){
            int temp = freq[nums2[i]];
            if(temp>0){
                freq[nums2[i]]--;
                res[index++] = nums2[i];
            }
        }
        int[] result = new int[index];
        for(int i=0;i<index;i++){
            result[i] = res[i];
        }
        return result;
    }
}