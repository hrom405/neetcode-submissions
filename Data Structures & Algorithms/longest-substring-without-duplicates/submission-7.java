class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0) return 0;
        Map<Character, Integer> m = new HashMap<>();
        int start =0,i=0;
        int max = 1;
        for(i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            if(m.containsKey(c)){
                start = Math.max(start, m.get(c)+1);
            }
            max = Math.max(max, i-start+1);
            m.put(c,i);
        }


        return max;
    }
}

