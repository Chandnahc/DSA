class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> s = new HashSet<>();
        int i = 0;

        while (i < word.length()) {
            if (word.charAt(i) < '0' || word.charAt(i) > '9') {
                i++;
                continue;
            }

            int start = i;

            while (i < word.length()
                    && word.charAt(i) >= '0'
                    && word.charAt(i) <= '9') {
                i++;
            }

            String num = word.substring(start, i);

            // Remove leading zeros, preserving one zero if all digits are zero.
            int j = 0;
            while (j < num.length() - 1 && num.charAt(j) == '0') {
                j++;
            }

            s.add(num.substring(j));
        }

        return s.size();
    }
}