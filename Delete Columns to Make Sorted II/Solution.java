class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        int count = 0;

        boolean[] sorted = new boolean[n - 1];

        for (int col = 0; col < m; col++) {

            boolean delete = false;

            // Check if this column breaks ordering
            for (int row = 0; row < n - 1; row++) {
                if (!sorted[row] &&
                    strs[row].charAt(col) > strs[row + 1].charAt(col)) {

                    delete = true;
                    break;
                }
            }

            // Delete column
            if (delete) {
                count++;
                continue;
            }

            // Mark resolved pairs
            for (int row = 0; row < n - 1; row++) {
                if (strs[row].charAt(col) <
                    strs[row + 1].charAt(col)) {

                    sorted[row] = true;
                }
            }
        }

        return count;
    }
}