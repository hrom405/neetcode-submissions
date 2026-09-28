class Solution {
    public boolean isAlphanumeric(char c) {
        char ascii = c;
        if (('A' <= ascii && ascii <= 'Z') || ('a' <= ascii && ascii <= 'z')
            || ('0' <= ascii && ascii <= '9')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        char[] c = s.toCharArray();

        while (start < end) {
            boolean isStartAlnum = isAlphanumeric(c[start]);
            boolean isEndAlnum = isAlphanumeric(c[end]);

            if (!isStartAlnum) {
                start++;
                continue;
            }

            if (!isEndAlnum) {
                end--;
                continue;
            }

            if (c[start] != c[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
