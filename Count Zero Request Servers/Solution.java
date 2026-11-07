class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int m = logs.length;
        int q = queries.length;

        int[] ans = new int[q];
        int[] freq = new int[n + 1];

        // Sort logs by timestamp
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        // Store queries along with their original indices
        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }

        // Sort queries by timestamp
        Arrays.sort(sortedQueries,
            (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = 0;
        int active = 0;

        for (int[] query : sortedQueries) {

            int time = query[0];
            int originalIndex = query[1];

            int start = time - x;

            // Add logs inside the current window's right boundary
            while (right < m && logs[right][1] <= time) {

                int server = logs[right][0];

                if (freq[server] == 0) {
                    active++;
                }

                freq[server]++;
                right++;
            }

            // Remove logs outside the current window's left boundary
            while (left < right && logs[left][1] < start) {

                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    active--;
                }

                left++;
            }

            ans[originalIndex] = n - active;
        }

        return ans;
    }
}