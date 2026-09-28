class Solution {
    public boolean isAlphanumeric(char c) {
        int ascii = (int) c;
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
        boolean isPal = true;

        while (start < end) {
            boolean isStartAlnum = isAlphanumeric(s.charAt(start));
            boolean isEndAlnum = isAlphanumeric(s.charAt(end));

            if (!isStartAlnum) {
                start++;
                continue;
            }

            if (!isEndAlnum) {
                end--;
                continue;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return isPal;
    }
}
