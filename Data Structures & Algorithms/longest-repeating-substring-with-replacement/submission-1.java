class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0,l =0,maxf=0;

        for(int r = 0;r<s.length();r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxf = Math.max(maxf, map.get(c));

            while((r-l+1) - maxf > k){
                char lc = s.charAt(l);
                map.put(lc, map.get(lc) -1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        
        return res;
    }
}
