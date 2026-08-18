class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA != countB) {
                return Integer.compare(countA, countB);
            }

            return Integer.compare(a, b);
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }

        return arr;
    }

    public int countOnes(int n) {
        if (n == 0) {
            return 0;
        }

        return countOnes(n / 2) + n % 2;
    }
}