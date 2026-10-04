class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1c = new int[26];
        int[] s2c = new int[26];
        int k = s1.length();
        char[] s2ch = s2.toCharArray();
        int i=0;
        for(char c : s1.toCharArray()){
            s1c[c-'a']++;
            s2c[s2ch[i] -'a']++;
            i++;
        }
        if(Arrays.equals(s1c,s2c)) return true;
        while(i<s2.length()){

         s2c[s2ch[i-k] -'a']--;
         s2c[s2ch[i] -'a']++;
        if(Arrays.equals(s1c,s2c)) return true;
            i++;
        }

        return false;
    }
}
