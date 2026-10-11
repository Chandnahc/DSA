class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long total = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        int k = k1 + k2;

        // Enough operations to eliminate every difference
        if (total <= k) {
            return 0;
        }

        // Binary search for the smallest feasible maximum difference
        int left = 0;
        int right = maxDiff;

        while (left < right) {
            int mid = left + (right - left) / 2;

            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int target = left;

        // Reduce every difference to at most target
        for (int i = 0; i < n; i++) {
            if (diff[i] > target) {
                k -= diff[i] - target;
                diff[i] = target;
            }
        }

        // Distribute any remaining operations
        for (int i = 0; i < n && k > 0; i++) {
            if (diff[i] == target) {
                diff[i]--;
                k--;
            }
        }

        // Calculate the final sum of squares
        long answer = 0;

        for (int d : diff) {
            answer += (long) d * d;
        }

        return answer;
    }
}