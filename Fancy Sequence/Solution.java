class Fancy {

    private static final long MOD = 1000000007L;

    private List<Long> list;

    private long multiplier = 1;
    private long addition = 0;

    public Fancy() {
        list = new ArrayList<>();
    }

    public void append(int val) {

        // Store value in normalized form:
        // actualValue = storedValue * multiplier + addition

        long stored = ((val - addition + MOD) % MOD);

        stored = stored * modInverse(multiplier) % MOD;

        list.add(stored);
    }

    public void addAll(int inc) {
        addition = (addition + inc) % MOD;
    }

    public void multAll(int m) {
        multiplier = multiplier * m % MOD;
        addition = addition * m % MOD;
    }

    public int getIndex(int idx) {

        if (idx >= list.size()) {
            return -1;
        }

        long value = list.get(idx);

        return (int)((value * multiplier + addition) % MOD);
    }

    private long modInverse(long x) {
        return power(x, MOD - 2);
    }

    private long power(long base, long exp) {

        long result = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = result * base % MOD;
            }

            base = base * base % MOD;
            exp >>= 1;
        }

        return result;
    }
}