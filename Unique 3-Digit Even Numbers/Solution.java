// class Solution {
//     public int totalNumbers(int[] digits) {
//         int[] freq = new int[10];
//         int countEven = 0;
//         for(int i:digits){
//             if(i%2==0) countEven++;
//             freq[i]++;
//         }

//         int res = countEven * (digits.length - freq[0] - 1) * (digits.length - 2);
//         for(int i=0;i<10;i++){
//             res /= factorial(freq[i]);
//         }
//         return res;

//     }

//     private int factorial(int n){
//         if(n==0 || n==1) return 1;
//         return n*factorial(n-1);
//     }
// }

class Solution {

    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        int ans = 0;

        // ------------------------------------------------
        // 1. ABC : all three digits are different
        // ------------------------------------------------

        // A = non-zero odd, C = even
        // B = any digit except A and C
        for (int d = 0; d <= 8; d += 2) {
            if (freq[d] == 0) continue;

            // C = d
            int remaining = digits.length - 1;

            // A can be any non-zero digit except d
            int possibleA = digits.length - freq[0] - (freq[d] > 0 ? 1 : 0);

            // This is not enough because B must also be different.
            // So count distinct A,C,B using distinct digit counts below.
        }

        // Count ABC properly using distinct digit counts
        int distinctNonZero = 0;
        int distinctEven = 0;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                if (d != 0) distinctNonZero++;
                if (d % 2 == 0) distinctEven++;
            }
        }

        // A is non-zero, C is even and A != C.
        // For each C:
        //   choices for A = distinct non-zero digits - (C != 0 ? 1 : 0)
        //   choices for B = distinct digits - 2
        int distinctDigits = 0;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                distinctDigits++;
            }
        }

        int abc = 0;

        for (int c = 0; c <= 8; c += 2) {
            if (freq[c] == 0) continue;

            int choicesA = distinctNonZero - (c != 0 ? 1 : 0);
            int choicesB = distinctDigits - 2;

            abc += choicesA * choicesB;
        }

        ans += abc;


        // ------------------------------------------------
        // 2. AAB : first two digits same
        // ------------------------------------------------
        //
        // A cannot be 0.
        // C must be even and C != A.
        //
        // A must occur >= 2 times.

        for (int a = 1; a <= 9; a++) {

            if (freq[a] < 2) continue;

            // Number of possible C values:
            // distinct even digits, except A if A is even.
            int choicesC = distinctEven;

            if (a % 2 == 0) {
                choicesC--;
            }

            ans += choicesC;
        }


        // ------------------------------------------------
        // 3. ABA : first and third digits same
        // ------------------------------------------------
        //
        // C = A, therefore A must be even.
        // A cannot be zero.
        // A must occur >= 2 times.
        // B must be different from A.

        for (int a = 2; a <= 8; a += 2) {

            if (freq[a] < 2) continue;

            // B can be any distinct digit except A.
            ans += distinctDigits - 1;
        }


        // ------------------------------------------------
        // 4. ABB : last two digits same
        // ------------------------------------------------
        //
        // B = C.
        // C must be even.
        // A must be non-zero and different from B.
        // B must occur >= 2 times.

        for (int b = 0; b <= 8; b += 2) {

            if (freq[b] < 2) continue;

            // A can be any non-zero digit except B.
            int choicesA = distinctNonZero;

            if (b != 0) {
                choicesA--;
            }

            ans += choicesA;
        }


        // ------------------------------------------------
        // 5. AAA : all three digits same
        // ------------------------------------------------
        //
        // Must be a non-zero even digit.
        // Must occur >= 3 times.

        for (int d = 2; d <= 8; d += 2) {

            if (freq[d] >= 3) {
                ans++;
            }
        }

        return ans;
    }
}