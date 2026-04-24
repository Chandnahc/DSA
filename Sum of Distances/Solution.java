class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Group indices
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: Process each group
        for (List<Integer> l : map.values()) {
            int len = l.size();
            long totalSum = 0;

            for (int idx : l) totalSum += idx;

            long leftSum = 0;

            for (int k = 0; k < len; k++) {
                int index = l.get(k);

                long rightSum = totalSum - leftSum - index;

                long leftContribution = (long) index * k - leftSum;
                long rightContribution = rightSum - (long) index * (len - k - 1);

                res[index] = leftContribution + rightContribution;

                leftSum += index;
            }
        }

        return res;
    }
}