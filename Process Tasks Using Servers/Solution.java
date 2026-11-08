class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        int n = servers.length;
        int m = tasks.length;

        // [weight, originalIndex]
        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            }
        );

        // [availableTime, weight, originalIndex]
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
                if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
                return Integer.compare(a[2], b[2]);
            }
        );

        // Initially, all servers are available.
        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[m];
        long timer = 0;

        for (int i = 0; i < m; i++) {

            timer = Math.max(timer, i);

            // Release all servers that have finished their tasks.
            while (!busy.isEmpty() && busy.peek()[0] <= timer) {
                int[] server = busy.poll();

                available.offer(new int[]{
                    server[1],
                    server[2]
                });
            }

            // If no server is available, advance time.
            if (available.isEmpty()) {
                timer = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] <= timer) {
                    int[] server = busy.poll();

                    available.offer(new int[]{
                        server[1],
                        server[2]
                    });
                }
            }

            // Select the best available server.
            int[] server = available.poll();

            ans[i] = server[1];

            // Assign task and move server to busy queue.
            busy.offer(new int[]{
                (int) (timer + tasks[i]),
                server[0],
                server[1]
            });
        }

        return ans;
    }
}