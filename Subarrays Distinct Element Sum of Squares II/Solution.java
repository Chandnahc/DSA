class Solution {
    private static final long MOD = 1_000_000_007L;

    public int sumCounts(int[] nums) {
        int n = nums.length;

        SegmentTree tree = new SegmentTree(n);
        int[] lastSeen = new int[100001];
        Arrays.fill(lastSeen, -1);

        long answer = 0;

        for (int i = 0; i < n; i++) {
            int previous = lastSeen[nums[i]];

            // Distinct counts increase for starting positions
            // from previous + 1 through i.
            tree.addRange(previous + 1, i);

            // Sum of squared distinct counts for subarrays
            // ending at index i.
            answer = (answer + tree.squareSum()) % MOD;

            lastSeen[nums[i]] = i;
        }

        return (int) answer;
    }

    static class SegmentTree {
        int n;
        long[] sum;
        long[] squareSum;
        long[] lazy;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            squareSum = new long[4 * n];
            lazy = new long[4 * n];
        }

        long squareSum() {
            return squareSum[1];
        }

        void addRange(int left, int right) {
            if (left <= right) {
                update(1, 0, n - 1, left, right);
            }
        }

        private void apply(int node, int start, int end, long delta) {
            long len = end - start + 1L;

            squareSum[node] = (
                squareSum[node]
                + 2L * delta * sum[node]
                + delta * delta % MOD * len
            ) % MOD;

            sum[node] = (
                sum[node] + delta * len
            ) % MOD;

            lazy[node] += delta;
        }

        private void pushDown(int node, int start, int end) {
            if (lazy[node] == 0 || start == end) {
                return;
            }

            int mid = start + (end - start) / 2;
            long delta = lazy[node];

            apply(node * 2, start, mid, delta);
            apply(node * 2 + 1, mid + 1, end, delta);

            lazy[node] = 0;
        }

        private void update(
            int node, int start, int end,
            int left, int right
        ) {
            if (left <= start && end <= right) {
                apply(node, start, end, 1);
                return;
            }

            pushDown(node, start, end);

            int mid = start + (end - start) / 2;

            if (left <= mid) {
                update(node * 2, start, mid, left, right);
            }

            if (right > mid) {
                update(node * 2 + 1, mid + 1, end, left, right);
            }

            sum[node] = (
                sum[node * 2] + sum[node * 2 + 1]
            ) % MOD;

            squareSum[node] = (
                squareSum[node * 2]
                + squareSum[node * 2 + 1]
            ) % MOD;
        }
    }
}
