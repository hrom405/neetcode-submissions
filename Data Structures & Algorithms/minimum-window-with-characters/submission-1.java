
class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n < m) {
            return "";
        }

        int[] freq = new int[128];

        for (int i = 0; i < m; i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0;
        int required = m;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if (freq[c] > 0) {
                required--;
            }
            freq[c]--;

            while (required == 0) {
                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}
