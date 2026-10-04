class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] cnt1 = new int[26];
        for (char c : s1.toCharArray()) cnt1[c - 'a']++;
        int[] cnt2 = new int[26];
        int n = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            cnt2[c - 'a']++;
            if (i >= n) cnt2[s2.charAt(i - n) - 'a']--; // remove char outside window
            if (Arrays.equals(cnt1, cnt2)) return true;
        }
        return false;
    }
}