class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if(m>n) return "";
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int start =0,l=0;
        int required = m;
        int minLength = Integer.MAX_VALUE;

        for(int r = 0;r<n;r++){
            char c = s.charAt(r);
            if(freq[c]>0)required--;

            freq[c]--;

            while(required == 0){
                int currLength = r - l + 1;
                if(currLength<minLength){
                    minLength = currLength;
                    start = l;
                }
                char cl = s.charAt(l);
                freq[cl]++;
                if(freq[cl] > 0){
                    required++;
                }
                l++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
        
    }
}
