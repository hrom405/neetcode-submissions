class Solution {
    public boolean isAnagram(String s, String t) {
        int[] c = new int[26];
        for(char a : s.toCharArray()){
            c[a-'a']++;
        }

        for(char a : t.toCharArray()){
            c[a-'a']--;
        }

        for(int i : c){
            if(i!=0) return false;
        }
        return true;
    }
}
