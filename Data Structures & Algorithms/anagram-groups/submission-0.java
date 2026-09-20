class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int[] a = new int[26];
            for(char c : s.toCharArray()){
                a[c -'a']++;
            }

            String st = Arrays.toString(a);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(s);     
        }
return new ArrayList<>(map.values());
    }
}
