class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for(int x : arr)
            sum += x;

        if(sum % 3 != 0)
            return false;

        int target = sum / 3;
        int curr = 0;
        int parts = 0;

        for(int i = 0; i < arr.length; i++) {
            curr += arr[i];

            if(curr == target) {
                parts++;
                curr = 0;
            }
        }

        return parts >= 3;
    }
}